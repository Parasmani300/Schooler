package com.app.web.parasmani.Schooler.model;


public class SchoolClass {
    Integer schoolNo;
    Integer classNo;
    String className;
    Integer totalStudent;
    String classTeacherName;
    Integer classTeacherEmployeeNo;

    public SchoolClass() {
    }

    public SchoolClass(Integer schoolNo, Integer classNo, String className, Integer totalStudent, String classTeacherName, Integer classTeacherEmployeeNo) {
        this.schoolNo = schoolNo;
        this.classNo = classNo;
        this.className = className;
        this.totalStudent = totalStudent;
        this.classTeacherName = classTeacherName;
        this.classTeacherEmployeeNo = classTeacherEmployeeNo;
    }

    public Integer getSchoolNo() {
        return schoolNo;
    }

    public void setSchoolNo(Integer schoolNo) {
        this.schoolNo = schoolNo;
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

    public Integer getTotalStudent() {
        return totalStudent;
    }

    public void setTotalStudent(Integer totalStudent) {
        this.totalStudent = totalStudent;
    }

    public String getClassTeacherName() {
        return classTeacherName;
    }

    public void setClassTeacherName(String classTeacherName) {
        this.classTeacherName = classTeacherName;
    }

    public Integer getClassTeacherEmployeeNo() {
        return classTeacherEmployeeNo;
    }

    public void setClassTeacherEmployeeNo(Integer classTeacherEmployeeNo) {
        this.classTeacherEmployeeNo = classTeacherEmployeeNo;
    }
}
