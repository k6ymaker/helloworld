package com.test.source.struct.type;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.stmt.WhileStmt;
import com.github.javaparser.ast.type.ArrayType;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
import org.junit.Test;

import javax.lang.model.type.NullType;
import java.io.File;

public class TypeTest {
    @Test
    public void test() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/type/MyTest.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(ArrayType n, Object arg) {
                System.out.println(n);
                super.visit(n, arg);
            }
        };

        cu.accept(visitor,null);
    }

    @Test
    public void NullType() throws Exception{
        File file = new File("./src/main/java/com/test/source/struct/type/MyTest.java");
        CompilationUnit cu = JavaParser.parse(file);

        VoidVisitorAdapter<Object> visitor = new VoidVisitorAdapter<Object>() {

        };

        cu.accept(visitor,null);
    }
}
