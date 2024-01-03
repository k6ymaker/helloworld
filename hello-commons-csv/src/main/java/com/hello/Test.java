package com.hello;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.util.List;

public class Test {
    public static void main(String[] args) throws Exception{
        String filePath = "./test.csv";

        String[] headers = new String[]{};
        //创建CSVFormat
        CSVFormat formator = CSVFormat.DEFAULT.withHeader(headers);

        FileReader fileReader=new FileReader(filePath);

        //创建CSVParser对象
        CSVParser parser=new CSVParser(fileReader,formator);

        List<CSVRecord> records=parser.getRecords();

        parser.close();
        fileReader.close();

        for(CSVRecord csvRecord:records){
            System.out.println(csvRecord.toMap());
        }

    }
}
