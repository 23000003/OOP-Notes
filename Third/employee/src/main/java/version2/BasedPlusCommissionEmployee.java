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
    
    public BasedPlusCommissionEmployee(Employee nEmployee) {
        this(0,0,nEmployee.getEmpName(), nEmployee.getEmpID());
    }

    public BasedPlusCommissionEmployee(double baseSalary, double totalSales) {
        this(baseSalary, totalSales, null, 0);
    }

    public BasedPlusCommissionEmployee(String empName, int empID) {
        this(0,0,empName, empID);
    }
    
    public BasedPlusCommissionEmployee(double baseSalary, double totalSales, Employee nEmployee) {
        this(baseSalary, totalSales, nEmployee.getEmpName(), nEmployee.getEmpID());
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
        sb.append(super.toString())
                .append("\nBase Salary: ")
                .append(this.getBaseSalary());
        return sb.toString();
    }
    @Override
    public double computeSalary(){
        return super.computeSalary() + this.baseSalary;
    }
    
    public void displayBasedPEmployee(){
        System.out.println(this);
        double x = this.computeSalary();
        System.out.println("Computed Salary: " + x + "\n");
    }
}