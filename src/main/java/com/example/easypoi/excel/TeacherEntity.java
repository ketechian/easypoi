package com.example.easypoi.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/3/28 18:56
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ExcelTarget("teacherEntity")
public class TeacherEntity implements Serializable {
    /**
     * ID
     */
    private String id;

    @Excel(name = "主讲老师_major,代课老师_absent", orderNum = "1",needMerge = true, isImportField = "true_major,true_absent")
    private String name;
}
