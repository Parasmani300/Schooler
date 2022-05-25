package com.app.web.parasmani.Schooler.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class School {
    String schoolName;
    Integer schoolNo;

    public School() {
    }

    public School(String schoolName, Integer schoolNo) {
        this.schoolName = schoolName;
        this.schoolNo = schoolNo;
    }

    @JsonProperty("school")
    public String getSchoolName() {
        return schoolName;
    }

    @JsonProperty("school")
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @JsonProperty("registrationNumber")
    public Integer getSchoolNo() {
        return schoolNo;
    }

    @JsonProperty("registrationNumber")
    public void setSchoolNo(Integer schoolNo) {
        this.schoolNo = schoolNo;
    }
}
