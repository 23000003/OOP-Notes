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
    
    private String empFName;
    private String empLName;
    private char empMI;
    private int empID;

    public Name() {
    }

    public Name(String empFName, String empLName, char empMI, int empID) {
        this.empFName = empFName;
        this.empLName = empLName;
        this.empMI = empMI;
        this.empID = empID;
    }

    public String getEmpFName() {
        return empFName;
    }

    public void setEmpFName(String empFName) {
        this.empFName = empFName;
    }

    public String getEmpLName() {
        return empLName;
    }

    public void setEmpLName(String empLName) {
        this.empLName = empLName;
    }

    public char getEmpMI() {
        return empMI;
    }

    public void setEmpMI(char empMI) {
        this.empMI = empMI;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }
    
}
