package com.GreatLearning.Model;

public class adminDepartment extends SuperDepartment{
    public String departmentName(){
        return "Admin Department";
    }
    public String getTodaysWork(){
        return "Complete your documents Submission";
    }
    public String getWorkDeadline(){
        return "Complete by EOD";
    }
}
