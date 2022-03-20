package hello.test.test;

import org.objectweb.asm.*;
import org.objectweb.asm.commons.AdviceAdapter;
import org.objectweb.asm.Opcodes;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Method;

public class Test {
    public static byte[] readClass() throws Exception{
        String filename = "./Hello.class";
        File f = new File(filename);
        Long fileLength = f.length();

        FileInputStream in = new FileInputStream(f);

        byte[] fileContent = new byte[fileLength.intValue()];

        in.read(fileContent);

        in.close();

        return fileContent;
    }

    static class ChangeVisitor extends ClassVisitor{
        ChangeVisitor(ClassVisitor classVisitor) {
            super(Opcodes.ASM5, classVisitor);

        }

        @Override
        public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions) {
            MethodVisitor methodVisitor = super.visitMethod(access, name, desc, signature, exceptions);
            if (name.equals("<init>")) {
                return methodVisitor;
            }
            return new ChangeAdapter(Opcodes.ASM4, methodVisitor, access, name, desc);
        }
    }

    static class ChangeAdapter extends AdviceAdapter {
        private int startTimeId = -1;

        private String methodName = null;

        ChangeAdapter(int api, MethodVisitor mv, int access, String name, String desc) {
            super(api, mv, access, name, desc);
            methodName = name;
        }

        @Override
        protected void onMethodEnter() {
            super.onMethodEnter();

            loadArg(0);
            //String name
            mv.visitMethodInsn(INVOKESTATIC, "hello/test/test/Tool", "test", "(Ljava/lang/String;)V", false);
           
        }



        @Override
        protected void onMethodExit(int opcode) {
            super.onMethodExit(opcode);
        }
    }


    static class MyClassLoader extends ClassLoader{
        private MyClassLoader(){

        }

        public static Class<?> defineClass(String classname,byte[] code){
            return new MyClassLoader().defineClass(classname,code,0,code.length);
        }
    }


    public static void main(String[] args) throws Exception{
        String classname = "hello.test.demo.Hello";
        byte[] content = readClass();
        ClassReader cr = new ClassReader(content);
        ClassWriter cw = new ClassWriter(cr,ClassWriter.COMPUTE_MAXS);
        ClassVisitor change = new ChangeVisitor(cw);
        cr.accept(change,ClassReader.EXPAND_FRAMES);

        Class clazz = MyClassLoader.defineClass(classname, cw.toByteArray());
        Object obj = clazz.newInstance();
        Method  method = clazz.getDeclaredMethod("hello",String.class);
        method.invoke(obj,"world");
    }
}
