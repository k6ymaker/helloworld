package com.test;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.File;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestInputEntity {
    @Excel(name = "a")
    private String a;
    @Excel(name = "b")
    private String b;
    @Excel(name = "c")
    private String c;

    public static void main(String[] args) {
        File f = new File("./test.xlsx");

        ImportParams params = new ImportParams();
        params.setHeadRows(1);

        List<TestInputEntity> list = ExcelImportUtil.importExcel(f, TestInputEntity.class, params);
        list.forEach(System.out::println);
    }
}
