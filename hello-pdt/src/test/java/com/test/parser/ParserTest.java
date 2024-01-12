package com.test.parser;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.php.core.PHPVersion;
import org.eclipse.php.core.ast.nodes.*;
import org.eclipse.php.core.ast.visitor.AbstractVisitor;
import org.junit.Test;

import java.io.StringReader;

public class ParserTest {
    @Test
    public void test() throws Exception{
        String code = "<?php\n" +
                "  function execHelper($cmd){\n" +
                "    return shell_exec($cmd);\n" +
                "  }\n" +
                "?>";

        ASTParser astParser = ASTParser.newParser(PHPVersion.PHP7_4, true, true);
        astParser.setSource(new StringReader(code));

        Program program = astParser.createAST(new NullProgressMonitor());

        //System.out.println(program);

        program.accept0(new AbstractVisitor() {
            @Override
            public boolean visit(MethodDeclaration methodDeclaration) {
                System.out.println(methodDeclaration);
                return super.visit(methodDeclaration);
            }

            @Override
            public boolean visit(FunctionDeclaration functionDeclaration) {
                System.out.println(functionDeclaration);
                return super.visit(functionDeclaration);
            }
        });

    }
}
