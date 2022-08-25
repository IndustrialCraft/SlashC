package com.github.industrialcraft.slashc.codegen;

import org.objectweb.asm.*;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TupleGenerator implements Opcodes {
    public static byte[] create(String name, String internalName, Type... types){
        ClassWriter cw = new ClassWriter(0);
        FieldVisitor fv;
        MethodVisitor mv;

        cw.visit(49,
                ACC_PUBLIC + ACC_SUPER,
                name,
                null,
                "java/lang/Object",
                null);

        //cw.visitSource("Hello.java", null);

        for(int i = 0;i < types.length;i++) {
            fv = cw.visitField(ACC_PUBLIC | ACC_FINAL, "t"+i, types[i].getDescriptor(), null, null);
            fv.visitEnd();
        }

        {
            mv = cw.visitMethod(ACC_PUBLIC, "<init>", "(" + Arrays.stream(types).map(type -> type.getDescriptor()).collect(Collectors.joining("")) + ")V", null, null);
            mv.visitVarInsn(ALOAD, 0);
            mv.visitMethodInsn(INVOKESPECIAL,
                    "java/lang/Object",
                    "<init>",
                    "()V",
                    false);
            for(int i = 0;i < types.length;i++) {
                mv.visitParameter("t"+i, 0);
                mv.visitVarInsn(ALOAD, 0);
                mv.visitVarInsn(types[i].getOpcode(ILOAD), i+1);
                mv.visitFieldInsn(PUTFIELD, internalName, "t"+i, types[i].getDescriptor());
            }
            mv.visitInsn(RETURN);
            mv.visitMaxs(1+types.length, 1+types.length);
            mv.visitEnd();
        }
        cw.visitEnd();

        return cw.toByteArray();
    }
}
