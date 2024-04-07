package com.hipolis.edu.manage.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hipolis.edu.manage.dto.Student;
import com.hipolis.edu.manage.mapper.StudentMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

/**
 * @className: StudentService
 * @description:
 * @author: hipolis
 * @create: 2024-04-07 22:45
 **/
@Service
public class StudentService {

    @Resource
    private StudentMapper studentMapper;

    public List<Student> listStudents() {
        return studentMapper.selectList(new QueryWrapper<>());
    }

    public Student addStudent(Student student) {
        if (student.getId() == null) {
            student.setId(UUID.randomUUID().toString());
        }
        studentMapper.insert(student);
        return studentMapper.selectById(student.getId());
    }

    public Student modifyStudent(Student student) {
        studentMapper.updateById(student);
        return studentMapper.selectById(student.getId());
    }

    public Student deleteStudent(Student student) {
        Student sample = studentMapper.selectById(student.getId());
        if (sample != null) {
            studentMapper.deleteById(student);
        }
        return sample;
    }
}
