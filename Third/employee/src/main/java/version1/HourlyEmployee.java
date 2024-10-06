/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version1;

/**
 *
 * @author User
 */
public class HourlyEmployee {
    private float totalHoursWorked;
    private double ratePerHour;
    private String empName;
    private int empID;

    public HourlyEmployee(String empName, int empID) {
        this(0, 0, empName, empID);
//        this.empName = empName;
//        this.empID = empID;
    }
    
    public HourlyEmployee(float totalHoursWorked, double ratePerHour, String empName, int empID) {
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
        this.empName = empName;
        this.empID = empID;
    }

    public HourlyEmployee() {
    }

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }
    
    
    private double computeSalary(){
//        -> total hours worked * rate per hour
//        -> overtime will be paid 150%
//        -> when it is over 40 hours
        if(this.totalHoursWorked > 40){
            return this.ratePerHour * 40 + ((this.ratePerHour + this.ratePerHour / 2) * (this.totalHoursWorked - 40)); 
        }else{
            return this.totalHoursWorked * this.ratePerHour;
        }
        
    }
    
    public void displayHourlyEmployee(){
//        System.out.println("Employee Name: " + this.empName);
//        System.out.println("Employee ID: " + this.empID);
//        System.out.println("Rates Per Hour: " + this.ratePerHour);
//        System.out.println("Total Hours Worked: " + this.totalHoursWorked);
//        System.out.println("Total Salary: " + this.computeSalary());
        System.out.println(this);
    }
    
    @Override
    public String toString(){
         return "Employee Name: " + this.empName + "\nEmployee ID: " + this.empID + "\nRates Per Hour: " + this.ratePerHour
                 + "\nTotal Hours Worked: " + this.totalHoursWorked + "\nTotal Salary: " + this.computeSalary();
    }
   
}