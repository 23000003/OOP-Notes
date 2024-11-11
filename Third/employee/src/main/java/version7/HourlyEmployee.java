/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version7;

/**
 *
 * @author User
 */
public class HourlyEmployee extends Employee {
    
    private float totalHoursWorked;
    private double ratePerHour;

    public HourlyEmployee() {
    }

    public HourlyEmployee(Name name, int empID) {
        super(name, empID);
    }

    public HourlyEmployee(Date hired, Date birthday) {
        super(hired, birthday);
    }
    
    public HourlyEmployee(float totalHoursWorked, double ratePerHour) {
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public HourlyEmployee(Date hired, Date birthday, Name name, int empID, float totalHoursWorked, double ratePerHour) {
        super(hired, birthday, name, empID);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public HourlyEmployee(String empFName, String empLName, String empMI, int empID, int bYear, 
            int bMonth, int bDay, int hYear, int hMonth, int hDay, float totalHoursWorked, double ratePerhour) {
        super(empFName, empLName, empMI, empID, bYear, bMonth, bDay, hYear, hMonth, hDay);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerhour;
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
    
    @Override
    public double computeSalary(){
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