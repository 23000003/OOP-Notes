/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employee;
//import version1.*;
import version2.*;

/**
 *
 * @author User
 */
public class Main {

    public static void main(String[] args) {
        
        
        Employee x = new CommissionEmployee(5431, "CEKenny", 153032);
        x.displayEmployeeDetails(); // the toString() is overridden in CommissionEmp
          
        Employee y = new BasedPlusCommissionEmployee(1342, 253,"BPCEKenny", 230003);
        y.displayEmployeeDetails(); // the toString() is overridden in BPCEmp
    }
}



// ========================== VERSION 1 ===========================

// USE GETTER AND SETTER and 3 CONSTRUCTORS See BasedPlus Class
        
        // =====================  HOURLY EMPLOYEE ======================
        // public HourlyEmployee(float totalHoursWorked, double ratePerHour, String empName, int empID)
        
        
//        System.out.println("\n========== Constructor 1 ==========");
//        HourlyEmployee myHourly1 = new HourlyEmployee(41, 100, "Kenny", 23000003);
//        myHourly1.displayHourlyEmployee(); // DISPLAY 1
//        System.out.println(" ");
//
//        System.out.println("\n========== Constructor 2 ==========");
//
//        HourlyEmployee myHourly2 = new HourlyEmployee("IamConstruct2", 23125213);
//        myHourly2.displayHourlyEmployee(); // DISPLAY 2
//        System.out.println(" ");
//        myHourly2.setTotalHoursWorked(51);
//        myHourly2.setRatePerHour(1000);
//        myHourly2.displayHourlyEmployee(); // DISPLAY 3
//
//        System.out.println("\n========== Constructor 3 ==========");
//        
//        HourlyEmployee myHourly3 = new HourlyEmployee();
//        myHourly3.displayHourlyEmployee(); // DISPLAY 4
//        System.out.println(" ");
//        myHourly3.setEmpID(105434);
//        myHourly3.setEmpName("MY Hourly 3");
//        myHourly3.setRatePerHour(12);
//        myHourly3.setTotalHoursWorked(4);
//        myHourly3.displayHourlyEmployee(); // DISPLAY 5
//        
        
        
        
        // ======================== Commission Employee ======================
        //public CommissionEmployee(double totalSales, String empName, int empID)
        
//        System.out.println("\n========== Constructor 1 ==========");
//        
//        CommissionEmployee x1 = new CommissionEmployee(10000, "Joe Harru", 1035213);
//        x1.displayHourlyEmployee(); // DISPLAY 1
//        
//        System.out.println("\n========== Constructor 2 ==========");
//        
//        CommissionEmployee x2 = new CommissionEmployee("JOE HARRY BRUH", 34125643);
//        x2.displayHourlyEmployee(); // DISPLAY 2
//        System.out.println(" ");
//        x2.setTotalSales(235);
//        x2.displayHourlyEmployee(); // DISPLAY 3
//        
//        
//        System.out.println("\n========== Constructor 3 ==========");
//        
//        CommissionEmployee x3 = new CommissionEmployee();
//        x3.displayHourlyEmployee(); // DISPLAY 4
//        System.out.println(" ");
//        x3.setEmpName("Commission Name XX");
//        x3.setEmpID(123543623);
//        x3.setTotalSales(5123);
//        x3.displayHourlyEmployee(); // DISPLAY 5
        
        
        // ============================ PIECE WORK EMPLOYEE =========================        
        //PieceWorkEmployee(int totalPiecesFinished, double ratePerPiece, String empName, int empID)
        
//        System.out.println("\n========== Constructor 1 ==========");
//
//        PieceWorkEmployee y1 = new PieceWorkEmployee(230, 100, "Maratas", 523135);
//        y1.displayHourlyEmployee(); // DISPLAY 1
//        System.out.println(" ");
//        
//        System.out.println("\n========== Constructor 2 ==========");
//
//        PieceWorkEmployee y2 = new PieceWorkEmployee("MARATAS part 2", 3123455);
//        y2.displayHourlyEmployee(); // DISPLAY 2
//        System.out.println(" ");
//        y2.setRatePerPiece(321);
//        y2.setTotalPiecesFinished(23);
//        y2.displayHourlyEmployee(); // DISPLAY 3
//
//        System.out.println("\n========== Constructor 3 ==========");
//        
//        PieceWorkEmployee y3 = new PieceWorkEmployee();
//        y3.displayHourlyEmployee(); // DISPLAY 4
//        System.out.println(" ");
//        y3.setEmpID(21);
//        y3.setEmpName("Maratas part 3");
//        y3.setRatePerPiece(11);
//        y3.setTotalPiecesFinished(21);
//        y3.displayHourlyEmployee(); // DISPLAY 5



        // ============================== Based Plus Commission Employee =============================
        //BasedPlusCommissionEmployee(double totalSales, double baseSalary, String empName, int empID
        
        
//        System.out.println("\n========== Constructor 1 ==========");
//
//        BasedPlusCommissionEmployee z1 = new BasedPlusCommissionEmployee(5000, 203, "BTR", 500213);
//        z1.displayHourlyEmployee(); // DISPLAY 1
//        
//        System.out.println("\n========== Constructor 2 ==========");
//
//        BasedPlusCommissionEmployee z2 = new BasedPlusCommissionEmployee("FERARI", 2043);
//        z2.displayHourlyEmployee(); // DISPLAY 2
//        System.out.println(" ");
//        z2.setBaseSalary(1431);
//        z2.setTotalSales(143);
//        z2.displayHourlyEmployee(); // DISPLAY 3
//        
//        System.out.println("\n========== Constructor 3 ==========");
//
//        BasedPlusCommissionEmployee z3 = new BasedPlusCommissionEmployee();
//        z3.displayHourlyEmployee(); // DISPLAY 4
//        System.out.println(" ");
//        z3.setEmpID(23);
//        z3.setEmpName("Buggatti");
//        z3.setBaseSalary(1231);
//        z3.setTotalSales(663);
//        z3.displayHourlyEmployee(); // DISPLAY 5