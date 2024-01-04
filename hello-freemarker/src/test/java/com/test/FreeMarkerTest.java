package com.test;

import freemarker.template.Configuration;
import freemarker.template.Template;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FreeMarkerTest {
    public static class Element{
        String s;

        public Element(String s) {
            this.s = s;
        }

        public String getS() {
            return s;
        }

        public void setS(String s) {
            this.s = s;
        }

        public String test(){
            return this.s + "===";
        }
    }


    @Test
    public void test()throws Exception{
        Configuration configuration = new Configuration();

        configuration.setDirectoryForTemplateLoading(new File("template"));

        configuration.setDefaultEncoding("utf-8");

        Template template = configuration.getTemplate("test/test.ftl");

        Element element = new Element("s1");

        Map root = new HashMap<>();
        root.put("hello","hello freemarker");
        root.put("element",element);

        A a = new A("test");
        B b = new B(a);

        root.put("b",b);



        FileWriter fileWriter = new FileWriter(new File("output/test.txt"));

        template.process(root,fileWriter);

        fileWriter.flush();
        fileWriter.close();
    }

    @Test
    public void include()throws Exception{
        Configuration configuration = new Configuration();

        configuration.setDirectoryForTemplateLoading(new File("template"));

        configuration.setDefaultEncoding("utf-8");

        Template template = configuration.getTemplate("include/main.ftl");

        Map root = new HashMap<>();
        root.put("name","yu jiang");
        root.put("includeHeader","header1.ftl");

        FileWriter fileWriter = new FileWriter(new File("output/include/main.txt"));

        template.process(root,fileWriter);

        fileWriter.flush();
        fileWriter.close();
    }

    @Test
    public void list() throws Exception{
        Configuration configuration = new Configuration();

        configuration.setDirectoryForTemplateLoading(new File("template"));

        configuration.setDefaultEncoding("utf-8");

        Template template = configuration.getTemplate("list/list.ftl");

        Map root = new HashMap<>();
        List<String> strs = new ArrayList<>();
        strs.add("a");
        strs.add("a1");
        strs.add("a2");
        strs.add("a3");


        root.put("vo",strs);

        FileWriter fileWriter = new FileWriter(new File("output/list/list.txt"));

        template.process(root,fileWriter);

        fileWriter.flush();
        fileWriter.close();
    }

    @Test
    public void condition() throws Exception{
        Configuration configuration = new Configuration();

        configuration.setDirectoryForTemplateLoading(new File("template"));

        configuration.setDefaultEncoding("utf-8");

        Template template = configuration.getTemplate("condition/condition.ftl");

        Map root = new HashMap<>();
        root.put("condition",true);
        root.put("condition1",true);
        root.put("condition2",false);

        FileWriter fileWriter = new FileWriter(new File("output/condition/condition.txt"));

        template.process(root,fileWriter);

        fileWriter.flush();
        fileWriter.close();
    }

    @Test
    public void exists() throws Exception{
        Configuration configuration = new Configuration();

        configuration.setDirectoryForTemplateLoading(new File("template"));

        configuration.setDefaultEncoding("utf-8");

        Template template = configuration.getTemplate("exists/exists.ftl");

        Map root = new HashMap<>();
//        root.put("hello","1");

//        root.put("hello_array",new ArrayList<>());

        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(1);
        root.put("hello_array",arrayList);

        FileWriter fileWriter = new FileWriter(new File("output/exists/exists.txt"));

        template.process(root,fileWriter);

        fileWriter.flush();
        fileWriter.close();
    }





}
