/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employee;
import com.mycompany.employee.version1.*;

/**
 *
 * @author User
 */
public class Employee {

    public static void main(String[] args) {
        
        // USE GETTER AND SETTER and 3 CONSTRUCTORS See BasedPlus Class
        
        System.out.println("Hello World!");
        // public HourlyEmployee(float totalHoursWorked, double ratePerHour, String empName, int empID)
        HourlyEmployee myHourly = new HourlyEmployee(41, 100, "Kenny", 23000003);
        myHourly.displayHourlyEmployee();
        System.out.println(" ");
        
        //public CommissionEmployee(double totalSales, String empName, int empID)
        CommissionEmployee x = new CommissionEmployee(10000, "Joe Harru", 1035213);
        x.displayHourlyEmployee();
        System.out.println(" ");
        
        //PieceWorkEmployee(int totalPiecesFinished, double ratePerPiece, String empName, int empID)
        PieceWorkEmployee y = new PieceWorkEmployee(230, 100, "Maratas", 523135);
        y.displayHourlyEmployee();
        System.out.println(" ");
        //BasedPlusCommissionEmployee(double totalSales, double baseSalary, String empName, int empID
        BasedPlusCommissionEmployee z = new BasedPlusCommissionEmployee(5000, 203, "BTR", 500213);
        z.displayHourlyEmployee();
    }
}
