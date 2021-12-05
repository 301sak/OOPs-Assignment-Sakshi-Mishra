package com.GreatLearning.Main;

import com.GreatLearning.Model.*;
import com.GreatLearning.Service.*;
public class deptDriver {

    public static void main(String[] args){
        deptService ser = new deptService();
        adminDepartment admin = new adminDepartment();
        hrDepartment hr = new hrDepartment();
        techDepartment tech = new techDepartment();

        ser.showAdminDeptDetails(admin);
        System.out.println("\n");
        ser.showHrDeptDetails(hr);
        System.out.println("\n");
        ser.showTechDeptDetails(tech);

    }
}
