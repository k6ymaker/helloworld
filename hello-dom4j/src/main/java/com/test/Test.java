package com.test;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Test {
    public static void main(String[] args) throws Exception{
        SAXReader saxReader = new SAXReader();
        Document doc = saxReader.read(new File("./pom-test.xml"));
//        Node node = doc.selectSingleNode("/project");
//        System.out.println(node);
//        node.get
        Element element = doc.getRootElement();
        System.out.println(element.element("artifactId").attribute("type").getValue());

        Element element1 = element.element("//artifactId");
        System.out.println(element1.getStringValue());
        element1.setText("asdfsdfsdf");

        OutputFormat format = OutputFormat.createPrettyPrint();

        format.setEncoding("UTF-8");

        XMLWriter writer = new XMLWriter(new OutputStreamWriter(new FileOutputStream(new File("./new-pom.xml"))));
        writer.write(doc);
        writer.flush();
        writer.close();

    }
}
