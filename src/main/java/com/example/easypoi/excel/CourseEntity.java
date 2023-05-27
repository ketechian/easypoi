package com.example.easypoi.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelCollection;
import cn.afterturn.easypoi.excel.annotation.ExcelEntity;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/3/28 18:58
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ExcelTarget("courseEntity")
public class CourseEntity implements Serializable {
    /**
     * 主键
     */
    private String id;
    /**
     * 课程名称
     */
    @Excel(name = "课程名称", orderNum = "1", width = 25, needMerge = true)
    private String name;
    /**
     * 老师主键
     */
    @ExcelEntity(id = "absent")
    private TeacherEntity mathTeacher;

    @ExcelCollection(name = "学生", orderNum = "4")
    private List<ExportStudentEntity> students;
}
