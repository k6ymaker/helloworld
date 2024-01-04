package com.test;

import org.dom4j.Element;
import org.dom4j.tree.DefaultElement;

public class NewElement {
    public static void main(String[] args) {


        Element dep = new DefaultElement("dependency");
        Element groupId = new DefaultElement("groupId");
        groupId.setText("org.example");
        Element artifactId = new DefaultElement("artifactId");
        artifactId.setText("archetype-x-contract");
        Element version = new DefaultElement("version");
        version.setText("1.0-SNAPSHOT");
        dep.add(groupId);
        dep.add(artifactId);
        dep.add(version);

        System.out.println(dep.asXML());

    }
}
