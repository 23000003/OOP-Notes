/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version1;

/**
 *
 * @author User
 */
public class CommissionEmployee {
    private double totalSales;
    private String empName;
    private int empID;
    
    public CommissionEmployee(double totalSales, String empName, int empID) {
        this.totalSales = totalSales;
        this.empName = empName;
        this.empID = empID;
    }

    public CommissionEmployee() {
    }

    public CommissionEmployee(String empName, int empID) {
        this.empName = empName;
        this.empID = empID;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
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
//        -> less than  10,000 - 5% sales
//        -> less than 100,000 but greater than or eal to 10k - 10 % sales
//        -> less than 1M - 20% sales
//        -> above and equal to 1 M - 30% sales

        if(this.totalSales < 10000){
            return this.totalSales * 0.05;
        }else if(this.totalSales >= 10000 && this.totalSales < 100000){
            return this.totalSales * 0.10;
        }else if(this.totalSales >= 100000 && this.totalSales < 1000000){
            return this.totalSales * 0.20;
        }else{
            return this.totalSales * 0.30;
        }
    }
    
    public void displayHourlyEmployee(){
        System.out.println(this.toString());
    }
    
    @Override
    public String toString(){
         return "Employee Name: " + this.empName + "\nEmployee ID: " + this.empID 
                 + "\nTotal Sales: " + this.totalSales + "\nTotal Salary: " + this.computeSalary();
    }
    
}