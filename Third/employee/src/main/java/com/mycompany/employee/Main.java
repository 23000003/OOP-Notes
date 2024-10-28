/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employee;
//import version1.*;
//import version2.*;
import version4.*;

/**
 *
 * @author User
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("HEY");
        EmployeeRoster roster = new EmployeeRoster();
        roster.setCount(0);
        roster.setMax(5);
        roster.setEmpList(new Employee[5]);
        
        
        CommissionEmployee x = new CommissionEmployee(new Date(2352, 48, 43), new Date(2042, 22, 21), new Name("KennyW", "MaratasA", "Ma4"), 2354303, 5432);
        
        roster.AddEmployee(x);
        
        System.out.println(roster.CountCE());
        
        roster.DisplayCE();
        
        roster.AddEmployee(x);
        
        System.out.println(roster.CountCE());
        
        roster.DisplayCE();
    }
}


//Employee n = new Employee(new Date(2012, 26, 21), new Date(2052, 28, 42), new Name("Kenny", "Maratas", "Ma"),  23000003);
//        n.displayEmployeeDetails();
//        
//        System.out.println("============ COMMISSION EMPLOYEE ============\n");
//        System.out.println("======= Constructor 1");
//        CommissionEmployee x = new CommissionEmployee(new Date(2352, 48, 43), new Date(2042, 22, 21), new Name("KennyW", "MaratasA", "Ma4"), 2354303, 5432);
//        x.displayCommissionEmployee();
//        
//        System.out.println("\n======= Constructor 2");
//        CommissionEmployee x1 = new CommissionEmployee();
//        x1.displayCommissionEmployee();
//        x1.setEmployeeName(new Name("KeDAWDWAnny", "MaraDWADWAtas", "MaWADAW"), 230654003);
//        x1.setTotalSales(34512);
//        x1.displayCommissionEmployee();
//        x1.setEmployeeHiredBday(new Date(2135, 31, 52), new Date(2002, 54, 2135));
//        x1.displayCommissionEmployee();
//        
//        
//        System.out.println("============ BASEDPLUS COMMISSION EMPLOYEE ============\n");
//        BasedPlusCommissionEmployee y1 = new BasedPlusCommissionEmployee();
//        y1.displayBasedPEmployee();
//        y1.setEmployeeName(new Name("WDNAWUDWHAUID", "DWAGR"), 12341231);
//        y1.displayBasedPEmployee();
//        y1.setEmployeeHiredBday(new Date(2435, 33, 32), new Date(2012, 34, 2035));
//        y1.setBaseSalary(2314);
//        y1.displayBasedPEmployee();