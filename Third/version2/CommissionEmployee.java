/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version2;

/**
 *
 * @author User
 */
public class CommissionEmployee extends Employee {
    
    private double totalSales;

    public CommissionEmployee() {
    }

    public CommissionEmployee(double totalSales) {
        this(totalSales, null, 0);
    }

    public CommissionEmployee(String empName, int empID) {
        this(0,empName, empID);
    }

    public CommissionEmployee(double totalSales, String empName, int empID) {
        super(empName, empID);
        this.totalSales = totalSales;
    }
    
    
}