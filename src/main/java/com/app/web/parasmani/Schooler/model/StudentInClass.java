package com.app.web.parasmani.Schooler.model;

public class StudentInClass {
    Integer classNo;
    String className;
    Integer studentAdmnNo;
    Integer studentRollNo;
    String firstName;
    String lastName;

    public StudentInClass() {
    }

    public StudentInClass(Integer classNo, String className, Integer studentAdmnNo, Integer studentRollNo, String firstName, String lastName) {
        this.classNo = classNo;
        this.className = className;
        this.studentAdmnNo = studentAdmnNo;
        this.studentRollNo = studentRollNo;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Integer getClassNo() {
        return classNo;
    }

    public void setClassNo(Integer classNo) {
        this.classNo = classNo;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Integer getStudentAdmnNo() {
        return studentAdmnNo;
    }

    public void setStudentAdmnNo(Integer studentAdmnNo) {
        this.studentAdmnNo = studentAdmnNo;
    }

    public Integer getStudentRollNo() {
        return studentRollNo;
    }

    public void setStudentRollNo(Integer studentRollNo) {
        this.studentRollNo = studentRollNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
