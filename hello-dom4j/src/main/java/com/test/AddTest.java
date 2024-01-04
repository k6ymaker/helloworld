package com.test;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.QName;
import org.dom4j.dom.DOMElement;
import org.dom4j.io.SAXReader;
import org.dom4j.tree.BaseElement;
import org.dom4j.tree.DefaultElement;

import java.io.File;

public class AddTest {
    public static void main(String[] args) throws Exception{
//        SAXReader saxReader = new SAXReader();
//        Document doc = saxReader.read(new File("./pom-test.xml"));
//        Element element = new DefaultElement();
//        doc.add();
        SAXReader saxReader = new SAXReader();

        Document pom = saxReader.read(new File("./pom-test.xml"));
        Element element = new BaseElement(new QName("aa",pom.getRootElement().getNamespace()));
        element.addElement("asdf");
        //element.setText("asdf");

        pom.getRootElement().add(element);

        System.out.println(element.getNamespaceURI()=="");

        //System.out.println(element.attribute("xmlns"));
        System.out.println(pom.asXML());
    }
}
