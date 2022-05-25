package com.app.web.parasmani.Schooler.Query;

public class FeeQuery {
    public static final String INSERT_FEE =
            "Insert into Fee(" +
                    "admissionNo," +
                    "firstName," +
                    "lastName," +
                    "className," +
                    "month," +
                    "year," +
                    "amount)" +
                    "values(" +
                    "?,?,?,?,?,?,?)";

    public static final String TAKE_ADMISSION =
            "Insert into Admission(" +
                    "ADMISSIONNO," +
                    "FirstName," +
                    "LastName," +
                    "FatherName," +
                    "ClassName)" +
                    "values (" +
                    "?,?,?,?,?)";

    public static final String MAKE_SCHOOL  = "Insert " +
            "into " +
            "School(" +
            "SchoolName," +
            "SchoolNo)" +
            " values(?," +
            "?)";

    public static final String ADD_CLASS = "Insert into SchoolClass" +
            "(schoolNo," +
            "classNo," +
            "className," +
            "totalStudent," +
            "classTeacherName," +
            "classTeacherEmployeeNo) " +
            "values(?,?,?,?,?,?)";

    public static final String ADD_STUDENT_TO_CLASS = "Insert into " +
            "StudentInClass(ClassNo," +
            "className," +
            "studentAdmnNo," +
            "studentRollNo)" +
            " values(?,?,?,?)";

}
