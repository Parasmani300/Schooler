package com.app.web.parasmani.Schooler.model;

public class Admission {
    Integer admissionNo;
    String firstName;
    String lastName;
    String fatherName;
    String className;

    public Admission() {
    }

    public Admission(Integer admissionNo, String firstName, String lastName, String fatherName, String className) {
        this.admissionNo = admissionNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.className = className;
    }

    public Integer getAdmissionNo() {
        return admissionNo;
    }

    public void setAdmissionNo(Integer admissionNo) {
        this.admissionNo = admissionNo;
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

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
