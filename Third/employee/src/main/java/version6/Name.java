/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version6;

/**
 *
 * @author Kenny
 */
public class Name {
    
    private String empFName;
    private String empLName;
    private String empMI;

    public Name() {
    }

    public Name(String empFName, String empLName) {
        this.empFName = empFName;
        this.empLName = empLName;
    }
    
    public Name(String empFName, String empLName, String empMI) {
        this.empFName = empFName;
        this.empLName = empLName;
        this.empMI = empMI;
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

    public String getEmpMI() {
        return empMI;
    }

    public void setEmpMI(String empMI) {
        this.empMI = empMI;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee Name: ").append(this.empFName).append(" ");
    
        if (this.getEmpMI() != null) {
            sb.append(this.getEmpMI().charAt(0)).append(". ");
        }
        
        sb.append(this.getEmpLName());

        return sb.toString();
    }
    
    public void displayNameDetails(){
        System.out.println(this);
    }
    
}
