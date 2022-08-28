package com.github.industrialcraft.slashc.util;

import com.github.industrialcraft.slashc.parsing.ParsedData;
import com.github.industrialcraft.slashc.parsing.ParsedSourceFile;

import java.io.File;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;

public class ASTPrinter {
    public static void print(Object obj, File file){
        printObjectPart(file.getName().replace(".sl", ""), obj, 0);
    }
    private static void printObjectPart(String prepend, Object data, int tab) {
        if(tab > 15){
            System.out.println("[Cyclic]");
            return;
        }
        String tabs = "\t".repeat(tab);
        try {
            if(data == null){
                System.out.println(tabs + prepend + ":null");
                return;
            }
            if (data instanceof ParsedData<?> parsedData)
                data = parsedData.data;
            if(data == null){
                System.out.println(tabs + prepend + ":<null>");
                return;
            }
            if (data.getClass().isPrimitive() || data instanceof Number || data instanceof Boolean || data instanceof Character || data instanceof CharSequence) {
                System.out.println(tabs + prepend + ":" + data);
            } else if(data instanceof List<?> list) {
                System.out.println(tabs + prepend + ":" + data.getClass().getSimpleName() + "(" + list.size() + ")");
                int i = 0;
                Iterator it = list.iterator();
                while (it.hasNext()){
                    printObjectPart(""+i, it.next(), tab+1);
                    i++;
                }
            } else if (data.getClass().isArray()) {
                Object[] arr = ((Object[])data);
                System.out.println(tabs + prepend + ":[" + arr.length + "]");
                for(int i = 0;i < arr.length;i++){
                    printObjectPart(""+i, arr[i], tab+1);
                }
            } else if(data instanceof Enum<?>) {
                System.out.println(tabs + prepend + ":" + data);
            } else {
                System.out.println(tabs + prepend + ":" + (data instanceof ParsedData pdata?pdata.data.getClass().getSimpleName():data.getClass().getSimpleName()));
                for(Field field : data.getClass().getDeclaredFields()){
                    Object fdata = field.get(data);
                    printObjectPart(field.getName(), fdata, tab+1);
                }
                //printObjectPart(data, tab + 1);
            }
        } catch(Exception e){
            System.out.println(tabs + "[Error]");
        }
    }

}
