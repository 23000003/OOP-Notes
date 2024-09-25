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
    
    public Employee(String empFName, String empLName, char empMI, int empID){
        this(empFName, empLName, empMI, empID, 0, 0, 0, 0, 0, 0);
    }
    
    public Employee(int bYear, int bMonth, int bDay, int hYear, int hMonth, int hDay){
        this(null, null, ' ', 0, bYear, bMonth, bDay, hYear, hMonth, hDay);
    }
    
    public Employee(String empFName, String empLName, char empMI, int empID, int bYear, int bMonth, int bDay, int hYear, int hMonth, int hDay){
        this.employeeName = new Name(empFName, empLName, empMI, empID);
        this.employeeBday = new Date(bYear, bMonth, bDay);
        this.employeeHired = new Date(hYear, hMonth, hDay);
    }
    
    
}
