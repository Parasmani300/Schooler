package com.app.web.parasmani.Schooler.model;

public class Fee {
    Integer admissionNo;
    String firstName;
    String lastName;
    String className;
    String month;
    String year;
    Double amount;

    public Fee() {
    }

    public Fee(Integer admissionNo, String firstName, String lastName, String className, String month, String year,Double amount) {
        this.admissionNo = admissionNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.className = className;
        this.month = month;
        this.year = year;
        this.amount = amount;
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

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
