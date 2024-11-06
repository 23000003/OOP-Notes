/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version7;


/**
 *
 * @author User
 */
public class CommissionEmployee extends Employee {
    
    private double totalSales;

    public CommissionEmployee() {
//        this("x", "x", "x", -1, -1, -1, -1, -1, -1, -1, 0);
    }

     public CommissionEmployee(double totalSales) {
        this.totalSales = totalSales;
    }
     
    public CommissionEmployee(Name name, int empID) {
//        this(new Date(-1, -1, -1), new Date(-1, -1, -1), name, empID, 0);
        super(name, empID);
    }

    public CommissionEmployee(Date hired, Date birthday, double totalSales) {
//        this(hired, birthday, new Name("x", "x", "x"), -1, 0);
        super(hired, birthday);
        this.totalSales = totalSales;
    }
    
    public CommissionEmployee(Date hired, Date birthday, Name name, int empID, double totalSales) {
        super(hired, birthday, name, empID);
        this.totalSales = totalSales;
    }

    public CommissionEmployee(String empFName, String empLName, String empMI, int empID, 
                int bYear, int bMonth, int bDay, int hYear, int hMonth, int hDay, double totalSales) {
        super(empFName, empLName, empMI, empID, bYear, bMonth, bDay, hYear, hMonth, hDay);
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