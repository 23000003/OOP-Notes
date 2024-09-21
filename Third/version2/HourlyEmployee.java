/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version2;

/**
 *
 * @author User
 */
public class HourlyEmployee extends Employee {
    
    private float totalHoursWorked;
    private double ratePerHour;

    public HourlyEmployee() {
    }

    public HourlyEmployee(float totalHoursWorked, double ratePerHour) {
        this(totalHoursWorked, ratePerHour, null, 0);
    }

    public HourlyEmployee(String empName, int empID) {
        this(0, 0, empName, empID);
    }

    public HourlyEmployee(float totalHoursWorked, double ratePerHour, String empName, int empID) {
        super(empName, empID);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }
   
}