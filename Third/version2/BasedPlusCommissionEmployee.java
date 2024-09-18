/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version2;

/**
 *
 * @author User
 */
public class BasedPlusCommissionEmployee extends Employee {
    private double totalSales;
    private double baseSalary;
    private String empName;
    private int empID;
    
    public BasedPlusCommissionEmployee(double totalSales, double baseSalary, String empName, int empID) {
        this.totalSales = totalSales;
        this.baseSalary = baseSalary;
        this.empName = empName;
        this.empID = empID;
    }
    
    public BasedPlusCommissionEmployee() {
    }
    
    public BasedPlusCommissionEmployee(String empName, int empID) {
        this.setTotalSales(0);
        this.setBaseSalary(0);
        this.totalSales = this.getTotalSales();
        this.baseSalary = this.getBaseSalary();
        this.empName = empName;
        this.empID = empID;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
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
    
    
   
    
    // ==================== MY FUNCTIONS =====================
    
    private double computeSalary(){
        if(this.totalSales < 10000){
            return this.totalSales * 0.05 + baseSalary;
        }else if(this.totalSales >= 10000 && this.totalSales < 100000){
            return this.totalSales * 0.10 + baseSalary;
        }else if(this.totalSales >= 100000 && this.totalSales < 1000000){
            return this.totalSales * 0.20 + baseSalary;
        }else{
            return this.totalSales * 0.30 + baseSalary;
        }
    }
    
    public void displayHourlyEmployee(){
        System.out.println(this.toString());
    }
    
    @Override
    public String toString(){
         return "Employee Name: " + this.empName + "\nEmployee ID: " + this.empID + "\nBase Salary: " + this.baseSalary
                 + "\nTotal Sales: " + this.totalSales + "\nTotal Salary: " + this.computeSalary();
    }
    
}