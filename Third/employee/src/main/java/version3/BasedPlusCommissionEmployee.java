/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version3;

/**
 *
 * @author User
 */
public class BasedPlusCommissionEmployee extends CommissionEmployee {

    private double baseSalary;

    public BasedPlusCommissionEmployee() {
        this("x", "x", "x", -1, -1, -1, -1, -1, -1, -1, 0);
    }

    public BasedPlusCommissionEmployee(double baseSalary) {
        this(new Date(-1, -1, -1), new Date(-1, -1, -1), new Name("x", "x", "x"), -1, baseSalary);
    }

    public BasedPlusCommissionEmployee(Name name, int empID) {
        this(new Date(-1, -1, -1), new Date(-1, -1, -1), name, empID, 0);
    }
    
    public BasedPlusCommissionEmployee(Date hired, Date birthday) {
        this(hired, birthday, new Name("x", "x", "x"), -1, 0);
    }

    public BasedPlusCommissionEmployee(Date hired, Date birthday, Name name, int empID, double baseSalary) {
        super(hired, birthday, name, empID, 0); //0 is from totalsales cuz of super
        this.baseSalary = baseSalary;
    }

    public BasedPlusCommissionEmployee(String empFName, String empLName, String empMI, 
                int empID, int bYear, int bMonth, int bDay, int hYear, int hMonth, int hDay, double baseSalary) {
        super(empFName, empLName, empMI, empID, bYear, bMonth, bDay, hYear, hMonth, hDay, 0);
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