/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version3;
/**
 *
 * @author User
 */
public class Employee {
    
    private Name employeeName;
    private Date employeeBday;
    private Date employeeHired;
    private int empID;
    
    public Employee() {
    }
   
    public Employee(Name name, int empID){
        this.employeeName = name;
        this.empID = empID;
    }
    
    public Employee(Date hired, Date birthday){
        this.employeeHired = hired;
        this.employeeBday = birthday;
    }
    
    public Employee(Date hired, Date birthday, Name name, int empID){
        this.employeeName = name;
        this.employeeHired = hired;
        this.employeeBday = birthday;
        this.empID = empID;
    }
    
    public Employee(String empFName, String empLName, String empMI, int empID){
        this(empFName, empLName, empMI, empID, 0, 0, 0, 0, 0, 0);
    }
    
    public Employee(int bYear, int bMonth, int bDay, int hYear, int hMonth, int hDay){
        this(null, null, null, 0, bYear, bMonth, bDay, hYear, hMonth, hDay);
    }
    
    public Employee(String empFName, String empLName, String empMI, int empID, int bYear, int bMonth, int bDay, int hYear, int hMonth, int hDay){
        this.employeeName = new Name(empFName, empLName, empMI);
        this.employeeBday = new Date(bYear, bMonth, bDay);
        this.employeeHired = new Date(hYear, hMonth, hDay);
        this.empID = empID;
    }

    public Name getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(Name name, int empID) {
        this.employeeName = name;
        this.empID = empID;
    }

    public Date getEmployeeBday() {
        return employeeBday;
    }

    public void setEmployeeBday(Date employeeBday) {
        this.employeeBday = employeeBday;
    }

    public Date getEmployeeHired() {
        return employeeHired;
    }

    public void setEmployeeHired(Date employeeHired) {
        this.employeeHired = employeeHired;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }
    
    public void setEmployeeHiredBday(Date bday, Date hired){
        this.employeeHired = hired;
        this.employeeBday = bday;
    }
    
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Employee ID: ").append(this.empID).append("\n").append(this.getEmployeeName().toString()).append("\n")
                .append("Birthdate: ").append(this.getEmployeeBday().toString()).append("\n")
                .append("Date Hired: ").append(this.getEmployeeHired().toString()).append("\n");
        
        return sb.toString();
    }
    
    public void displayEmployeeDetails(){
        System.out.println(this); //toString() Override
    }
    
}
