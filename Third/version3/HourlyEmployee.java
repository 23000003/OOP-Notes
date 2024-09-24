/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version3;

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

    public HourlyEmployee(Employee nEmp) {
        this(0, 0, nEmp.getEmpName(), nEmp.getEmpID());
    }
    
    public HourlyEmployee(String empName, int empID) {
        this(0, 0, empName, empID);
    }
    
    public HourlyEmployee(float totalHoursWorked, double ratePerHour, Employee nEmp) {
        this(totalHoursWorked, ratePerHour, nEmp.getEmpName(), nEmp.getEmpID());
    }
    
    public HourlyEmployee(float totalHoursWorked, double ratePerHour, String empName, int empID) {
        super(empName, empID);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
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
        sb.append(super.toString())
                .append("Rates Per Hour: ").append(this.ratePerHour).append("\n")
                .append("Total Hours Worked: ").append(this.totalHoursWorked);
        
        return sb.toString();
    }
    
    public void displayHourlyEmployee(){
        System.out.println(this);
        System.out.println("Computed Salary: " + this.computeSalary() + "\n");

    }
   
}