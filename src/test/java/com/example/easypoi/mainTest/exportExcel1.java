package com.example.easypoi.mainTest;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import com.example.easypoi.excel.ExportStudentEntity;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/3/28 15:30
 */

public class exportExcel1 {
    public static void main(String[] args) throws IOException {
        List<ExportStudentEntity> list = new ArrayList<>();
        list.add(new ExportStudentEntity("001", "张三", 1, new Date(),new Date()));
        list.add(new ExportStudentEntity("002", "李四", 1, new Date(),new Date()));
        list.add(new ExportStudentEntity("003", "王五", 2, new Date(),new Date()));


        //导出
        Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams("学生信息表","学生信息")
                , ExportStudentEntity.class, list);
        //写入指定位置
        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\zheyuan he\\Desktop\\Test.xlsx");
        workbook.write(outputStream);
        outputStream.close();
        workbook.close();
    }
}
