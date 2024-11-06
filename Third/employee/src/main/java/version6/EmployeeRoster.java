/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version6;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class EmployeeRoster {
//    private Employee[] empList;
    private ArrayList<Employee> empList;
    private int count;
    private int max;

    public EmployeeRoster(){
    }
    
    public EmployeeRoster(ArrayList<Employee> empList, int count, int max) {
        this.empList = empList;
        this.count = count;
        this.max = max;
    }
    
    public ArrayList<Employee> getEmpList() {
        return empList;
    }

    public void setEmpList(ArrayList<Employee> empList) {
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
        
        this.empList.add(Emp);
        this.count++;
        
        return true;
    }
    
    public Employee RemoveEmployee(int id)
    {
        Employee toDelete = null;
        
        for (int i = 0; i < empList.size(); i++) {
            if (empList.get(i).getEmpID() == id) {
                toDelete = empList.get(i);
                empList.remove(i);
                this.count--;
                break;
            }
        }
        
        return toDelete;
    }
    
    public int CountHE()
    {
        int count = 0;
        
        for(int i = 0; i < this.count; i++){
           if(empList.get(i) instanceof HourlyEmployee){
                count++;
             }
        }
        
        return count;
    }
    
    public int CountCE()
    {
        int count = 0;
        
        for(int i = 0; i < this.count; i++){
            if(empList.get(i) instanceof CommissionEmployee && 
                !(empList.get(i) instanceof BasedPlusCommissionEmployee))
            {
                count++;
            }
        }
        
        return count;
    }
    
    public int CountBCPE()
    {
        int count = 0;
        
        for(int i = 0; i < this.count; i++){
            if(empList.get(i) instanceof BasedPlusCommissionEmployee){
                count++;
            }
        }
        
        return count;
    }
    
    public int CountPWE()
    {
        int count = 0;
        
        for(int i = 0; i < this.count; i++){
            if(empList.get(i) instanceof PieceWorkEmployee){
                count++;
            }
        }
        
        return count;
    }
    
    public void DisplayHE()
    {
        for(int i = 0; i < count; i++){
            if(empList.get(i) instanceof HourlyEmployee h){
               h.displayHourlyEmployee();
            }
        }
    }
    
    public void DisplayCE()
    {
        for(int i = 0; i < count; i++){
            if(empList.get(i) instanceof CommissionEmployee c && 
                    !(empList.get(i) instanceof BasedPlusCommissionEmployee))
            {
               c.displayCommissionEmployee();
            }
        }
    }
    
    public void DisplayBCPE()
    {
        for(int i = 0; i < count; i++){
            if(empList.get(i) instanceof BasedPlusCommissionEmployee c){
               c.displayBasedPEmployee();
            }
        }
    }
    
    public void DisplayPWE()
    {
        for(int i = 0; i < count; i++){
            if(empList.get(i) instanceof PieceWorkEmployee p){
               p.displayPWEmployee();
            }
        }
    }
    
    public void displayAllEmployee() {
    System.out.printf("%-10s| %-25s| %-15s| %-15s| %-10s| %-30s\n", 
                      "ID", "Name", "DateOfBirth", "DateHired", "Salary", "Type of Employee");
    for (int i = 0; i < count; ++i) {
        System.out.printf("%-10s| ", empList.get(i).getEmpID());
        System.out.printf("%-20s| ", empList.get(i).getEmployeeName());
        System.out.printf("%-15s| ", empList.get(i).getEmployeeBday());
        System.out.printf("%-15s| ", empList.get(i).getEmployeeHired());

        if (empList.get(i) instanceof BasedPlusCommissionEmployee b) 
        {
            System.out.printf("%-10.2f| ", b.computeSalary());
        } 
        else if (empList.get(i) instanceof CommissionEmployee c) 
        {
            System.out.printf("%-10.2f| ", c.computeSalary());
        } 
        else if (empList.get(i) instanceof HourlyEmployee h) 
        {
            System.out.printf("%-10.2f| ", h.computeSalary());
        } 
        else if (empList.get(i) instanceof PieceWorkEmployee p) 
        {
            System.out.printf("%-10.2f| ", p.computeSalary());
        }
        
        System.out.printf("%-30s|\n", empList.get(i).getClass().getSimpleName());
    }
    System.out.println();
}
}
