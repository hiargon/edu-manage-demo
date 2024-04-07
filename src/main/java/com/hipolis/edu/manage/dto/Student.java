package com.hipolis.edu.manage.dto;

/**
 * @className: Student
 * @description:
 * @author: hipolis
 * @create: 2024-04-07 22:46
 **/

public class Student {

    private String id;
    private String name;
    private Integer sex;
    private Integer age;
    private Integer grade;
    private String classroom;
    private String headTeacher;
    private Double height;
    private Double weight;
    private String startDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getHeadTeacher() {
        return headTeacher;
    }

    public void setHeadTeacher(String headTeacher) {
        this.headTeacher = headTeacher;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }
}
