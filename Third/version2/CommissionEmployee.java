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

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }
    
    protected double computeSalary(double baseSalary){
        
        double totalSales;
        
        if(this.totalSales < 10000){
            totalSales = this.totalSales * 0.05 + baseSalary;
        }else if(this.totalSales >= 10000 && this.totalSales < 100000){
            totalSales = this.totalSales * 0.10;
        }else if(this.totalSales >= 100000 && this.totalSales < 1000000){
            totalSales = this.totalSales * 0.20 + baseSalary;
        }else{
            totalSales = this.totalSales * 0.30 + baseSalary;
        }
        
        return totalSales;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()); // Calls Employee's toString
        sb.append("Total Sales: ").append(this.getTotalSales()).append("\n");
        sb.append("Salary: ").append(this.computeSalary(0)).append("\n");
        return sb.toString();
    }
    
    protected String passToString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()); // Calls Employee's toString
        sb.append("Total Sales: ").append(this.getTotalSales()).append("\n");
        return sb.toString();
    }
    
    public void displayCommissionEmployee(){
        System.out.println(this.toString());
    }
    
}