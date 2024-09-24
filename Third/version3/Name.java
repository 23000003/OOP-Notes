/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version3;

/**
 *
 * @author Kenny
 */
public class Name {
    
    private String empName;
    private int empID;

    public Name() {
    }

    public Name(String empName) {
        this.empName = empName;
    }

    public Name(int empID) {
        this.empID = empID;
    }

    public Name(String empName, int empID) {
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
