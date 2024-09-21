/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version2;

/**
 *
 * @author User
 */
public class Employee {
    
    private String empName;
    private int empID;

    public Employee() {
    }

    public Employee(String empName) {
        this.empName = empName;
    }

    public Employee(int empID) {
        this.empID = empID;
    }

    public Employee(String empName, int empID) {
        this.empName = empName;
        this.empID = empID;
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
    
    
}
