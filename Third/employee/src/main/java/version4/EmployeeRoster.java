/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version4;

/**
 *
 * @author User
 */
public class EmployeeRoster {
    private Employee[] empList;
    private int count;
    private int max;

    public Employee[] getEmpList() {
        return empList;
    }

    public void setEmpList(Employee[] empList) {
        this.empList = empList;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
    
    public boolean AddEmployee(Employee Emp)
    {
        if(max == count) return false;
        
        this.empList[count++] = Emp;
        
        return true;
    }
    
    public Employee RemoveEmployee(int id)
    {
        
    }
    
    public int CountHE()
    {
        
    }
    
    public int CountCE()
    {
        
    }
    
    public int CountBCPE()
    {
        
    }
    
    public int CountPWE()
    {
        
    }
    
    public void DisplayHE()
    {
        
    }
    
    public void DisplayCE()
    {
        
    }
    
    public void DisplayBCPE()
    {
        
    }
    
    public void DisplayPWE()
    {
        
    }
    
    public void DisplayAllEmployee()
    {
        
    }
    
}
