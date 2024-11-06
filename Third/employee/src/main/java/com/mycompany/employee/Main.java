/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employee;
//import version1.*;
//import version2.*;
//import version3.*;
import version5.*;

/**
 *
 * @author User
 */
public class Main {

    public static void main(String[] args) {

        EmployeeRoster roster = new EmployeeRoster();
        roster.setCount(0);
        roster.setMax(5);
//        roster.setEmpList(new ArrayList<Employee>);
        
        // =======================
        CommissionEmployee x = new CommissionEmployee(new Date(2352, 48, 43), 
                new Date(2042, 22, 21), new Name("Kenn", "Ma", "Ma4"), 235, 5432);
        
        roster.AddEmployee(x);
        
        CommissionEmployee x1 = new CommissionEmployee(new Date(2562, 23, 73), 
                new Date(2035, 212, 211), 21213);
        
        x1.setEmployeeName(new Name("TEST", "WA", "HWADWA"), 231);
        
        roster.AddEmployee(x1);

        System.out.println("Count CE: " + roster.CountCE() + "\n");
        
        roster.DisplayCE();
        
        
        // ========================
        
        System.out.println("\n===========================");
        BasedPlusCommissionEmployee b = new BasedPlusCommissionEmployee(new Date(2135, 31, 52), 
                new Date(2002, 54, 2135), new Name("WDNA","DA" ,"G"), 123, 2314, 231);
        
        roster.AddEmployee(b);
        
        System.out.println("Count BPCE: " + roster.CountBCPE() + "\n");
        roster.DisplayBCPE();
        
        
        System.out.println("\n===========================");
        System.out.println("Count CE: " + roster.CountCE() + "\n");
        
        roster.DisplayCE();
        
        
        
       
        // ===============================
        System.out.println("\n===========================");
        System.out.println("Count: " + roster.getCount());
        roster.displayAllEmployee();
        
        
        Employee del = roster.RemoveEmployee(231);
        System.out.println("\n===========================");
        System.out.println("Count: " + roster.getCount());
        roster.displayAllEmployee();
        
        System.out.println("\n===========================");        
        del.displayEmployeeDetails();
    }
}


