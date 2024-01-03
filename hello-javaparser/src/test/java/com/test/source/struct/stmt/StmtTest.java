package com.test.source.struct.stmt;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.expr.UnaryExpr;
import com.github.javaparser.ast.stmt.*;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
import org.junit.Test;

import java.io.File;

public class StmtTest {
    @Test
    public void AssertStmt() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/stmt/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(AssertStmt n, Object arg) {
                System.out.println(n);
                super.visit(n, arg);
            }
        };

        cu.accept(visitor,null);
    }

    @Test
    public void BlockStmt() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/stmt/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(BlockStmt n, Object arg) {
                System.out.println(n);
                super.visit(n, arg);
            }
        };

        cu.accept(visitor,null);
    }

    @Test
    public void BreakStmt() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/stmt/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(BreakStmt n, Object arg) {
                System.out.println(n);
                super.visit(n, arg);
            }
        };

        cu.accept(visitor,null);
    }

    @Test
    public void CatchClause() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/stmt/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(CatchClause n, Object arg) {
                System.out.println(n);
                super.visit(n, arg);
            }
        };

        cu.accept(visitor,null);
    }


    @Test
    public void ContinueStmt() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/stmt/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(ContinueStmt n, Object arg) {
                System.out.println(n);
                super.visit(n, arg);
            }
        };

        cu.accept(visitor,null);
    }

    @Test
    public void DoStmt() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/stmt/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(DoStmt n, Object arg) {
                System.out.println(n);
                super.visit(n, arg);
            }
        };

        cu.accept(visitor,null);
    }

    @Test
    public void EmptyStmt() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/stmt/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(EmptyStmt n, Object arg) {
                System.out.println(n);
                super.visit(n, arg);
            }
        };

        cu.accept(visitor,null);
    }

    @Test
    public void ExplicitConstructorInvocationStmt() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/stmt/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(ExplicitConstructorInvocationStmt n, Object arg) {
                System.out.println(n);
                super.visit(n, arg);
            }
        };

        cu.accept(visitor,null);
    }

    @Test
    public void ExpressionStmt() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/stmt/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(ExpressionStmt n, Object arg) {
                System.out.println(n);
                super.visit(n, arg);
            }
        };

        cu.accept(visitor,null);
    }

    @Test
    public void ForeachStmt() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/stmt/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(ForeachStmt n, Object arg) {
                System.out.println(n);
                super.visit(n, arg);
            }
        };

        cu.accept(visitor,null);
    }

    @Test
    public void ForStmt() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/stmt/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(ForStmt n, Object arg) {
                System.out.println(n);
                super.visit(n, arg);
            }
        };

        cu.accept(visitor,null);
    }

    @Test
    public void IfStmt() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/stmt/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(IfStmt n, Object arg) {
                System.out.println(n);
                super.visit(n, arg);
            }
        };

        cu.accept(visitor,null);
    }

    @Test
    public void LabeledStmt() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/stmt/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(LabeledStmt n, Object arg) {
                System.out.println(n);
                super.visit(n, arg);
            }
        };

        cu.accept(visitor,null);
    }

    @Test
    public void ReturnStmt() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/stmt/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(ReturnStmt n, Object arg) {
                System.out.println(n);
                super.visit(n, arg);
            }
        };

        cu.accept(visitor,null);
    }

    @Test
    public void SwitchEntryStmt() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/stmt/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(SwitchEntryStmt n, Object arg) {
                System.out.println(n);
                super.visit(n, arg);
            }
        };

        cu.accept(visitor,null);
    }

    @Test
    public void SwitchStmt() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/stmt/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(SwitchStmt n, Object arg) {
                System.out.println(n);
                super.visit(n, arg);
            }
        };

        cu.accept(visitor,null);
    }

    @Test
    public void SynchronizedStmt() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/stmt/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(SynchronizedStmt n, Object arg) {
                System.out.println(n);
                super.visit(n, arg);
            }
        };

        cu.accept(visitor,null);
    }

    @Test
    public void ThrowStmt() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/stmt/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(ThrowStmt n, Object arg) {
                System.out.println(n);
                super.visit(n, arg);
            }
        };

        cu.accept(visitor,null);
    }

    @Test
    public void TryStmt() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/stmt/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(TryStmt n, Object arg) {
                System.out.println(n);
                super.visit(n, arg);
            }
        };

        cu.accept(visitor,null);
    }

    @Test
    public void TypeDeclarationStmt() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/stmt/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(TypeDeclarationStmt n, Object arg) {
                System.out.println(n);
                super.visit(n, arg);
            }
        };

        cu.accept(visitor,null);
    }

    @Test
    public void WhileStmt() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/stmt/MyClass.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(WhileStmt n, Object arg) {
                System.out.println(n);
                super.visit(n, arg);
            }
        };

        cu.accept(visitor,null);
    }
}
