package com.test;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.ArrayBracketPair;
import com.github.javaparser.ast.ArrayCreationLevel;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.PackageDeclaration;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.imports.SingleTypeImportDeclaration;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.io.File;

public class LearnASTStruct {

    static final String FILE_PATH = "./src/main/java/com/test/source/LearnASTStruct.java";

    public static void main(String[] args) throws Exception{
        CompilationUnit cu = JavaParser.parse(new File(FILE_PATH));

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {

            /**
             * TODO 没弄出来
             * @param n
             * @param arg
             */
            @Override
            public void visit(ArrayBracketPair n, Object arg) {
                super.visit(n, arg);
                System.out.println("[ArrayBracketPair]\n"+n.toString());
            }

            /**
             * new int[3] 中的 3
             * @param n
             * @param arg
             */
            @Override
            public void visit(ArrayCreationLevel n, Object arg) {
                super.visit(n, arg);
                System.out.println("[ArrayCreationLevel]\n"+n.toString());
            }

            /**
             * 包定义
             * @param n
             * @param arg
             */
            @Override
            public void visit(PackageDeclaration n, Object arg) {
                super.visit(n, arg);
            }




            //            /**
//             *
//             * @param n 包定义
//             * @param arg
//             */
//            @Override
//            public void visit(PackageDeclaration n, Object arg) {
//                super.visit(n, arg);
//                System.out.println("[PackageDeclaration]:\n"+n.toString());
//            }
//
//
//            @Override
//            public void visit(SingleTypeImportDeclaration n, Object arg) {
//                super.visit(n, arg);
//                ClassOrInterfaceType type = n.getType();
//                String old = type.getName();
//                type.setName(old.replace("LocalDateTime","q"));
//                System.out.println("[SingleTypeImportDeclaration]:\n"+n.toString());
//            }
//
//            @Override
//            public void visit(ClassOrInterfaceDeclaration n, Object arg){
//                super.visit(n,arg);
//
//                System.out.println("[ClassOrInterfaceDeclaration]:\n"+n.toString());
//            }
//
//            @Override
//            public void visit(VariableDeclarator n, Object arg){
//                super.visit(n,arg);
//                System.out.println(n.getId().getName());
//
//                n.setInit("\"haha\"");
//                System.out.println(n);
//            }
//
//            @Override
//            public void visit(ClassOrInterfaceType n, Object arg){
//                super.visit(n,arg);
//                //System.out.println("[ClassOrInterfaceType]:\n"+n.toString());
//            }
        };

        cu.accept(visitor,null);
    }
}
