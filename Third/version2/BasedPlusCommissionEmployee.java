/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version2;

/**
 *
 * @author User
 */
public class BasedPlusCommissionEmployee extends CommissionEmployee {

    private double baseSalary;

    public BasedPlusCommissionEmployee() {
    }

    public BasedPlusCommissionEmployee(double baseSalary, double totalSales) {
        this(baseSalary, totalSales, null, 0);
    }

    public BasedPlusCommissionEmployee(String empName, int empID) {
        this(0,0,empName, empID);
    }

    public BasedPlusCommissionEmployee(double baseSalary, double totalSales, String empName, int empID) {
        super(totalSales, empName, empID);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
   
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(passToString()); // Calls Employee's toString
        sb.append("Salary: ").append(computeSalary(this.baseSalary)).append("\n");
        sb.append("Base Salary: ").append(this.getBaseSalary()).append("\n");
        return sb.toString();
    }
    
    public void displayBasedPEmployee(){
        System.out.println(this.toString());
    }
}