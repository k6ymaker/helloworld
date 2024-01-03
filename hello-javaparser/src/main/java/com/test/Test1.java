package com.test;

import com.github.javaparser.JavaParser;
import com.github.javaparser.Range;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Modifier;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.PackageDeclaration;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.expr.AssignExpr;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.imports.EmptyImportDeclaration;
import com.github.javaparser.ast.imports.ImportDeclaration;
import com.github.javaparser.ast.imports.SingleTypeImportDeclaration;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.ExpressionStmt;
import com.github.javaparser.ast.stmt.Statement;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.io.File;

public class Test1 {
    static final String FILE_PATH = "./SampleOne.java";

    public static void main(String[] args) throws Exception{
        CompilationUnit cu = JavaParser.parse(new File(FILE_PATH));
        ClassOrInterfaceDeclaration clazz = cu.getClassByName("SampleOne");
        NodeList<ImportDeclaration> imports= cu.getImports();
        //ImportDeclaration importDeclaration = new EmptyImportDeclaration();
        ImportDeclaration importDeclaration = new SingleTypeImportDeclaration().setType(new ClassOrInterfaceType("com.test.AA"));
        imports.add(importDeclaration);
        System.out.println(imports);
        //
        FieldDeclaration fieldDeclaration = clazz.addField("IHelloService","iHelloService", Modifier.PUBLIC,Modifier.STATIC);
        fieldDeclaration.getVariables().get(0).setInit("ProxyFactory.create(IHelloService.class,\"tcp://scfarchetype/HelloService\")");
        MethodDeclaration main = clazz.getMethodsByName("main").get(0);
//        main.getBody().addStatement("helloNode+=IHelloService.sayHello(helloNode)");
//        BlockStmt blockStmt = new BlockStmt();
//        blockStmt.addStatement(new ExpressionStmt());

//        System.out.println(cu);
        NameExpr receive = new NameExpr("helloNode");
        MethodCallExpr methodCallExpr = new MethodCallExpr(new NameExpr("IHelloService"),new NameExpr("sayHello"),new NodeList<Expression>().add(receive));

        AssignExpr assignExpr = new AssignExpr(receive,methodCallExpr, AssignExpr.Operator.plus);
        main.getBody().addStatement(0,assignExpr);
        System.out.println(cu);
    }
}