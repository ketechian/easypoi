package com.example.easypoi.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/3/28 19:34
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ExcelTarget("InputStudentEntity")
public class InputStudentEntity implements Serializable {
    /**
     * id
     */
    private String id;
    /**
     * 学生姓名
     */
    @Excel(name = "学生姓名", width = 20, isImportField = "true_st")
    private String name;
    /**
     * 学生学号
     */
    @Excel(name = "学生性别", replace = { "男生_1", "女生_2"}, isImportField = "true_st")
    private int sex;
    /**
     * 出生日期
     */
    @Excel(name = "出生日期", databaseFormat = "yyyyMMddHHmmss", format = "yyyy-MM-dd", width = 20, isImportField = "true_st")
    private Date birthday;
    /**
     * 进校日期
     */
    @Excel(name = "进校日期", databaseFormat = "yyyyMMddHHmmss", format = "yyyy-MM-dd")
    private Date registrationDate;
}
