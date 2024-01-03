package com.test.source.struct.body;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.*;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
import org.junit.Test;

import java.io.File;

public class BodyTest {


    /**
     *  AnnotationDeclaration整个注解声明体
     * @throws Exception
     */
    @Test
    public void AnnotationDeclaration() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/body/MyAnnotation.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(AnnotationDeclaration n, Object arg) {
                super.visit(n, arg);
                System.out.println(n.toString());
            }
        };

        cu.accept(visitor,null);
    }

    /**
     * 注解成员
     * @throws Exception
     */
    @Test
    public void AnnotationMemberDeclaration() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/body/MyAnnotation.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(AnnotationMemberDeclaration n, Object arg) {
                super.visit(n, arg);
                System.out.println(n.toString());
            }
        };

        cu.accept(visitor,null);
    }

    /**
     * 类或接口定义
     * @throws Exception
     */
    @Test
    public void ClassOrInterfaceDeclaration() throws Exception{
        //File file = new File("./src/main/java/com/test/source/struct/body/MyInterface.java");
        File file = new File("./src/main/java/com/test/source/struct/body/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(ClassOrInterfaceDeclaration n, Object arg) {
                super.visit(n, arg);
                System.out.println(n.toString());
            }
        };

        cu.accept(visitor,null);
    }

    /**
     * 构造函数定义
     * @throws Exception
     */
    @Test
    public void ConstructorDeclaration() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/body/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(ConstructorDeclaration n, Object arg) {
                super.visit(n, arg);
                System.out.println(n.toString());
            }
        };

        cu.accept(visitor,null);
    }

    @Test
    public void EmptyMemberDeclaration() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/body/EmptyMemberClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(EmptyMemberDeclaration n, Object arg) {
                super.visit(n, arg);
                System.out.println(n.toString());
            }
        };

        cu.accept(visitor,null);
    }

    /**
     * 枚举中的常量声明
     * @throws Exception
     */
    @Test
    public void EnumConstantDeclaration() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/body/EnumConstantDeclarationEnum.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(EnumConstantDeclaration n, Object arg) {
                super.visit(n, arg);
                System.out.println(n.toString());
            }
        };

        cu.accept(visitor,null);
    }

    /**
     * 枚举声明
     * @throws Exception
     */
    @Test
    public void EnumDeclaration() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/body/EnumConstantDeclarationEnum.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(EnumDeclaration n, Object arg) {
                System.out.println(n.toString());
                super.visit(n, arg);
            }
        };

        cu.accept(visitor,null);
    }

    /**
     * 类Filed声明
     * @throws Exception
     */
    @Test
    public void FieldDeclaration() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/body/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(FieldDeclaration n, Object arg) {
                super.visit(n, arg);
                System.out.println(n.toString());
            }
        };

        cu.accept(visitor,null);
    }

    /**
     * 静态或实例中的初始化块
     * @throws Exception
     */
    @Test
    public void InitializerDeclaration() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/body/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(InitializerDeclaration n, Object arg) {
                super.visit(n, arg);
                System.out.println(n.toString());
            }
        };

        cu.accept(visitor,null);
    }



    @Test
    public void MethodDeclaration() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/body/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(MethodDeclaration n, Object arg) {
                System.out.println(n.toString());
                super.visit(n, arg);
            }
        };

        cu.accept(visitor,null);
    }

    @Test
    public void Parameter() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/body/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(Parameter n, Object arg) {
                super.visit(n, arg);
                System.out.println(n.toString());
            }
        };

        cu.accept(visitor,null);
    }

    /**
     * 变量定义，可以在FiledDeclaration中也可以在VariableDeclarationExpr中
     * @throws Exception
     */
    @Test
    public void VariableDeclarator() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/body/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(VariableDeclarator n, Object arg) {
                super.visit(n, arg);
                System.out.println(n.toString());
            }
        };

        cu.accept(visitor,null);
    }



    @Test
    public void VariableDeclaratorId() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/body/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(VariableDeclaratorId n, Object arg) {
                super.visit(n, arg);
                System.out.println(n.toString());
            }
        };

        cu.accept(visitor,null);
    }
}
