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
    
    private double computeSalary(){
        if(this.totalHoursWorked > 40){
            return this.ratePerHour * 40 + ((this.ratePerHour + this.ratePerHour / 2) * (this.totalHoursWorked - 40)); 
        }else{
            return this.totalHoursWorked * this.ratePerHour;
        }
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Rates Per Hour: ").append(this.ratePerHour).append("\n");
        sb.append("Total Hours Worked: ").append(this.totalHoursWorked).append("\n");
        sb.append("Total Salary: ").append(this.computeSalary()).append("\n");
        
        return sb.toString();
    }
    
    public void displayHourlyEmployee(){
        System.out.println(this);
    }
   
}