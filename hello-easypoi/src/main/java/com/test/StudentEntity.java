//package com.test;
//
//import cn.afterturn.easypoi.excel.ExcelImportUtil;
//import cn.afterturn.easypoi.excel.annotation.Excel;
//import cn.afterturn.easypoi.excel.entity.ImportParams;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import java.io.File;
//import java.util.Date;
//import java.util.List;
//import org.json.simple.JSONArray;
//
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//public class StudentEntity {
//    @Excel(name = "姓名")
//    private String name;
//    @Excel(name = "年龄")
//    private int age;
//    @Excel(name = "操作时间",format="yyyy-MM-dd HH:mm:ss", width = 20.0)
//    private Date time;
//
//    public static void main(String[] args) {
//        ImportParams params = new ImportParams();
//        params.setTitleRows(1);
//        params.setHeadRows(1);
//        long start = new Date().getTime();
//        List<StudentEntity> list = ExcelImportUtil.importExcel(new File("/Users/lixin/Desktop/easypoi-user1.xls"),
//                UserEntity.class, params);
//        System.out.println(new Date().getTime() - start);
//        System.out.println(JSONArray.toJSONString(list));
//    }
//}
//
