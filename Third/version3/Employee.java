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
    
    
    public Employee() {
    }
   
    public Employee(Name name){
        this.employeeName = new Name(name.getEmpFName(), name.getEmpLName(), name.getEmpMI(), name.getEmpID());
    }
    
    public Employee(Date hired, Date birthday){
        this.employeeHired = new Date(hired.getYear(), hired.getMonth(), hired.getDay());
        this.employeeBday = new Date(birthday.getYear(), birthday.getMonth(), birthday.getDay());
    }
    
    public Employee(Date hired, Date birthday, Name name){
        this.employeeName = new Name(name.getEmpFName(), name.getEmpLName(), name.getEmpMI(), name.getEmpID());
        this.employeeHired = new Date(hired.getYear(), hired.getMonth(), hired.getDay());
        this.employeeBday = new Date(birthday.getYear(), birthday.getMonth(), birthday.getDay());
    }
    
    public Employee(String empFName, String empLName, String empMI, int empID){
        this(empFName, empLName, empMI, empID, 0, 0, 0, 0, 0, 0);
    }
    
    public Employee(int bYear, int bMonth, int bDay, int hYear, int hMonth, int hDay){
        this(null, null, null, 0, bYear, bMonth, bDay, hYear, hMonth, hDay);
    }
    
    public Employee(String empFName, String empLName, String empMI, int empID, int bYear, int bMonth, int bDay, int hYear, int hMonth, int hDay){
        this.employeeName = new Name(empFName, empLName, empMI, empID);
        this.employeeBday = new Date(bYear, bMonth, bDay);
        this.employeeHired = new Date(hYear, hMonth, hDay);
    }

    public Name getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(Name name) {
        this.employeeName = name;
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
    
    
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.getEmployeeName().toString()).append("\n")
                .append("Birthdate: ").append(this.getEmployeeBday().toString()).append("\n")
                .append("Date Hired: ").append(this.getEmployeeHired().toString()).append("\n");
        
        return sb.toString();
    }
    
    public void displayEmployeeDetails(){
        System.out.println(this); //toString() Override
    }
    
}
