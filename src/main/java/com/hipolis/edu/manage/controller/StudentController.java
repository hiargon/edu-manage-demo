package com.hipolis.edu.manage.controller;

import com.hipolis.edu.manage.dto.CommonResult;
import com.hipolis.edu.manage.dto.Student;
import com.hipolis.edu.manage.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @className: StudentController
 * @description:
 * @author: hipolis
 * @create: 2024-04-07 22:38
 **/
@RestController
@RequestMapping("stu")
public class StudentController {

    private static final Logger log = LoggerFactory.getLogger(StudentController.class);

    @Resource
    private StudentService studentService;

    @RequestMapping("/list")
    public CommonResult listStudent() {
        return new CommonResult<>(studentService.listStudents());
    }

    @RequestMapping("/add")
    public CommonResult addStudent(@RequestBody Student student) {
        try {
            Student studentInDb = studentService.addStudent(student);
            return new CommonResult<>(studentInDb);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return new CommonResult(-1, e);
        }
    }

    @RequestMapping("/modify")
    public CommonResult modifyStudent(@RequestBody Student student) {
        if (student.getId() == null || student.getId().trim().equals("")) {
            return new CommonResult(101, "id不能为空");
        }
        try {
            Student studentInDb = studentService.modifyStudent(student);
            return new CommonResult<>(studentInDb);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return new CommonResult(-1, e);
        }
    }

    @RequestMapping("/delete")
    public CommonResult deleteStudent(@RequestBody Student student) {
        if (student.getId() == null || student.getId().trim().equals("")) {
            return new CommonResult(101, "id不能为空");
        }
        try {
            Student studentDeleted = studentService.deleteStudent(student);
            return new CommonResult<>(studentDeleted);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return new CommonResult(-1, e);
        }
    }
}
