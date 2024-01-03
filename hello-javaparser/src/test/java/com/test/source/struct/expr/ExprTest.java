package com.test.source.struct.expr;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.expr.*;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
import org.junit.Test;

import java.io.File;

public class ExprTest {
//    @Test
//    public void AnnotationExpr() throws Exception{
//        File file = new File("./src/main/java/com/test/source/struct/expr/MyClass.java");
//        CompilationUnit cu = JavaParser.parse(file);
//
//        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
//
//        };
//
//        cu.accept(visitor,null);
//    }


    @Test
    public void ArrayAccessExpr() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/expr/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(ArrayAccessExpr n, Object arg) {
                super.visit(n, arg);
                System.out.println(n.toString());
            }
        };

        cu.accept(visitor,null);
    }

    @Test
    public void ArrayCreationExpr() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/expr/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(ArrayCreationExpr n, Object arg) {
                System.out.println(n.toString());
                super.visit(n, arg);
            }
        };

        cu.accept(visitor,null);
    }

    @Test
    public void ArrayInitializerExpr() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/expr/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(ArrayInitializerExpr n, Object arg) {
                System.out.println(n.toString());
                super.visit(n, arg);
            }
        };

        cu.accept(visitor,null);
    }

    @Test
    public void AssignExpr() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/expr/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(AssignExpr n, Object arg) {
                super.visit(n, arg);
                System.out.println(n.toString());
            }
        };

        cu.accept(visitor,null);
    }

    @Test
    public void BinaryExpr() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/expr/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(BinaryExpr n, Object arg) {
                super.visit(n, arg);
                System.out.println(n.toString());
            }
        };

        cu.accept(visitor,null);
    }

    @Test
    public void BooleanLiteralExpr() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/expr/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(BooleanLiteralExpr n, Object arg) {
                System.out.println(n.toString());
                super.visit(n, arg);
            }
        };

        cu.accept(visitor,null);
    }

    @Test
    public void CastExpr() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/expr/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(CastExpr n, Object arg) {
                super.visit(n, arg);
                System.out.println(n.toString());
            }
        };

        cu.accept(visitor,null);
    }

    @Test
    public void CharLiteralExpr() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/expr/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(CharLiteralExpr n, Object arg) {
                System.out.println(n.toString());
                super.visit(n, arg);
            }
        };

        cu.accept(visitor,null);
    }

    @Test
    public void ClassExpr() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/expr/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(ClassExpr n, Object arg) {
                System.out.println(n.toString());
                super.visit(n, arg);
            }
        };

        cu.accept(visitor,null);
    }


    @Test
    public void ConditionalExpr() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/expr/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(ConditionalExpr n, Object arg) {
                System.out.println(n.toString());
                super.visit(n, arg);
            }
        };

        cu.accept(visitor,null);
    }

    @Test
    public void DoubleLiteralExpr() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/expr/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(DoubleLiteralExpr n, Object arg) {
                System.out.println(n.toString());
                super.visit(n, arg);
            }
        };

        cu.accept(visitor,null);
    }

    @Test
    public void FieldAccessExpr() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/expr/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(FieldAccessExpr n, Object arg) {
                System.out.println(n.toString());
                super.visit(n, arg);
            }
        };

        cu.accept(visitor,null);
    }

    @Test
    public void InstanceOfExpr() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/expr/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(InstanceOfExpr n, Object arg) {
                super.visit(n, arg);
                System.out.println(n.toString());
            }
        };

        cu.accept(visitor,null);
    }

    @Test
    public void IntegerLiteralExpr() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/expr/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(IntegerLiteralExpr n, Object arg) {
                System.out.println(n.toString());
                super.visit(n, arg);
            }
        };

        cu.accept(visitor,null);
    }

    @Test
    public void IntegerLiteralMinValueExpr() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/expr/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(IntegerLiteralMinValueExpr n, Object arg) {
                System.out.println(n.toString());
                super.visit(n, arg);
            }
        };

        cu.accept(visitor,null);
    }

    @Test
    public void LambdaExpr() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/expr/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(LambdaExpr n, Object arg) {
                System.out.println(n.toString());
                super.visit(n, arg);
            }
        };

        cu.accept(visitor,null);
    }

    @Test
    public void LongLiteralExpr() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/expr/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(LongLiteralExpr n, Object arg) {
                System.out.println(n.toString());
                super.visit(n, arg);
            }
        };

        cu.accept(visitor,null);
    }

    @Test
    public void MarkerAnnotationExpr() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/expr/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(MarkerAnnotationExpr n, Object arg) {
                System.out.println(n.toString());
                super.visit(n, arg);
            }
        };

        cu.accept(visitor,null);
    }

    @Test
    public void MemberValuePair() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/expr/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(MemberValuePair n, Object arg) {
                System.out.println(n.toString());
                super.visit(n, arg);
            }
        };

        cu.accept(visitor,null);
    }

    @Test
    public void MethodCallExpr() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/expr/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(MethodCallExpr n, Object arg) {
                System.out.println(n.toString());
                super.visit(n, arg);
            }
        };

        cu.accept(visitor,null);
    }

    @Test
    public void MethodReferenceExpr() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/expr/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(MethodReferenceExpr n, Object arg) {
                System.out.println(n.toString());
                super.visit(n, arg);
            }
        };

        cu.accept(visitor,null);
    }

    @Test
    public void NameExpr() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/expr/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(NameExpr n, Object arg) {
                System.out.println(n.toString());
                super.visit(n, arg);
            }
        };

        cu.accept(visitor,null);
    }

    @Test
    public void NormalAnnotationExpr() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/expr/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(NormalAnnotationExpr n, Object arg) {
                System.out.println(n.toString());
                super.visit(n, arg);
            }
        };

        cu.accept(visitor,null);
    }

    @Test
    public void NullLiteralExpr() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/expr/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(NullLiteralExpr n, Object arg) {
                System.out.println(n.toString());
                super.visit(n, arg);
            }
        };

        cu.accept(visitor,null);
    }

    @Test
    public void ObjectCreationExpr() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/expr/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(ObjectCreationExpr n, Object arg) {
                System.out.println(n.toString());
                super.visit(n, arg);
            }
        };

        cu.accept(visitor,null);
    }

    @Test
    public void QualifiedNameExpr() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/expr/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(QualifiedNameExpr n, Object arg) {
                System.out.println(n.toString());
                super.visit(n, arg);
            }
        };

        cu.accept(visitor,null);
    }

    @Test
    public void SingleMemberAnnotationExpr() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/expr/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(SingleMemberAnnotationExpr n, Object arg) {
                System.out.println(n.toString());
                super.visit(n, arg);
            }
        };

        cu.accept(visitor,null);
    }

    @Test
    public void StringLiteralExpr() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/expr/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(StringLiteralExpr n, Object arg) {
                System.out.println(n.toString());
                super.visit(n, arg);
            }
        };

        cu.accept(visitor,null);
    }

    @Test
    public void SuperExpr() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/expr/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(SuperExpr n, Object arg) {
                System.out.println(n.toString());
                super.visit(n, arg);
            }
        };

        cu.accept(visitor,null);
    }

    @Test
    public void ThisExpr() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/expr/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(ThisExpr n, Object arg) {
                System.out.println(n.toString());
                super.visit(n, arg);
            }
        };

        cu.accept(visitor,null);
    }

    @Test
    public void UnaryExpr() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/expr/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(UnaryExpr n, Object arg) {
                System.out.println(n.toString());
                super.visit(n, arg);
            }
        };

        cu.accept(visitor,null);
    }

    @Test
    public void VariableDeclarationExpr() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/expr/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(VariableDeclarationExpr n, Object arg) {
                System.out.println(n.toString());
                super.visit(n, arg);
            }
        };

        cu.accept(visitor,null);
    }
}
