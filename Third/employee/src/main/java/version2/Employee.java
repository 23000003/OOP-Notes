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
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Employee ID: ").append(this.getEmpID()).append("\n");
        sb.append("Employee Name: ").append(this.getEmpName()).append("\n");
        
        return sb.toString();
    }
    
    public void displayEmployeeDetails(){
        System.out.println(this); //toString() Override
    }
}
