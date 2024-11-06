/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version7;

/**
 *
 * @author User
 */
public class BasedPlusCommissionEmployee extends CommissionEmployee {

    private double baseSalary;

    public BasedPlusCommissionEmployee() {
    }

    public BasedPlusCommissionEmployee(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public BasedPlusCommissionEmployee(Name name, int empID) {
        super(name, empID);
    }
    
    public BasedPlusCommissionEmployee(Date hired, Date birthday, double totalSales) {
        super(hired, birthday, totalSales);
    }

    public BasedPlusCommissionEmployee(Date hired, Date birthday, Name name, int empID, double baseSalary, double totalSales) {
        super(hired, birthday, name, empID, 5123); //0 is from totalsales cuz of super
        this.baseSalary = baseSalary;
    }

    public BasedPlusCommissionEmployee(String empFName, String empLName, String empMI, 
                int empID, int bYear, int bMonth, int bDay, int hYear, int hMonth, int hDay, double baseSalary, double totalSales) {
        super(empFName, empLName, empMI, empID, bYear, bMonth, bDay, hYear, hMonth, hDay, totalSales);
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