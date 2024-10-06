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
    
    public CommissionEmployee(Employee nEmp) {
        this(0,nEmp.getEmpName(), nEmp.getEmpID());
    }

    public CommissionEmployee(String empName, int empID) {
        this(0,empName, empID);
    }
    
    public CommissionEmployee(double totalSales, Employee nEmp) {
        this(totalSales, nEmp.getEmpName(), nEmp.getEmpID());
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
    
    protected double computeSalary(){
        
        double totalSales;
        
        if(this.totalSales < 10000){
            totalSales = this.totalSales * 0.05;
        }else if(this.totalSales >= 10000 && this.totalSales < 100000){
            totalSales = this.totalSales * 0.10;
        }else if(this.totalSales >= 100000 && this.totalSales < 1000000){
            totalSales = this.totalSales * 0.20;
        }else{
            totalSales = this.totalSales * 0.30;
        }
        
        return totalSales;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
                .append("Total Sales: ")
                .append(this.getTotalSales());

        return sb.toString();
    }
    
    public void displayCommissionEmployee(){
        System.out.println(this);
        System.out.println("Computed Salary: " + this.computeSalary() + "\n");
    }
    
}