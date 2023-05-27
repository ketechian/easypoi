package com.example.easypoi.mainTest;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import cn.afterturn.easypoi.util.PoiPublicUtil;
import com.example.easypoi.excel.InputStudentEntity;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.List;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/3/28 19:36
 */
public class InPutExcel {
    public static void main(String[] args) throws Exception {
        ImportParams params = new ImportParams();
        params.setTitleRows(1);
        params.setHeadRows(1);

        List<InputStudentEntity> list = ExcelImportUtil.importExcel(
                new FileInputStream("C:\\Users\\zheyuan he\\Desktop\\Test.xlsx"),
                InputStudentEntity.class, params);

        for (InputStudentEntity ise : list) {
            System.out.println(ise);
        }
    }
}
