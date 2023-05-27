package com.example.easypoi.mainTest;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import com.example.easypoi.excel.CourseEntity;
import com.example.easypoi.excel.ExportStudentEntity;
import com.example.easypoi.excel.TeacherEntity;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/3/28 19:04
 */
public class exportExcel2 {
    public static void main(String[] args) throws IOException {
        TeacherEntity t1 = new TeacherEntity("t1", "丹东");
        TeacherEntity t2 = new TeacherEntity("t2", "罗伯斯比尔");

        List<ExportStudentEntity> list1 = new ArrayList<>();
        list1.add(new ExportStudentEntity("001", "张三", 1, new Date(),new Date()));
        list1.add(new ExportStudentEntity("002", "李四", 1, new Date(),new Date()));

        List<ExportStudentEntity> list2 = new ArrayList<>();
        list2.add(new ExportStudentEntity("003", "王五", 2, new Date(),new Date()));
        list2.add(new ExportStudentEntity("004", "赵六", 1, new Date(),new Date()));

        List<CourseEntity> list3 = new ArrayList<>();
        list3.add(new CourseEntity("c1", "语文", t1, list1));
        list3.add(new CourseEntity("c2", "数学", t2, list2));

        Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams("Test", "测试", "测试"),
                CourseEntity.class, list3);
        //写入指定位置
        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\zheyuan he\\Desktop\\Test2.xlsx");
        workbook.write(outputStream);
        outputStream.close();
        workbook.close();
    }
}
