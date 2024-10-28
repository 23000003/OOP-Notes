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

    public EmployeeRoster(){
    }
    
    public EmployeeRoster(Employee[] empList, int count, int max) {
        this.empList = empList;
        this.count = count;
        this.max = max;
    }
    
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
        Employee toDelete = null;
        
        for(int i = 0; i < count; i++){
            if(empList[i].getEmpID() == id){
                toDelete = empList[i];
                
                for (int j = i; j < count - 1; j++) {
                    empList[j] = empList[j + 1];
                }
                count--;
                break;
            }
        }
        
        return toDelete;
    }
    
    public int CountHE()
    {
        int count = 0;
        
        for(int i = 0; i < this.count; i++){
           if(empList[i] instanceof HourlyEmployee){
                count++;
             }
        }
        
        return count;
    }
    
    public int CountCE()
    {
        int count = 0;
        
        for(int i = 0; i < this.count; i++){
            if(empList[i] instanceof CommissionEmployee){
                count++;
            }
        }
        
        return count;
    }
    
    public int CountBCPE()
    {
        return 1;
    }
    
    public int CountPWE()
    {
        int count = 0;
        
        for(int i = 0; i < this.count; i++){
            if(empList[i] instanceof PieceWorkEmployee){
                count++;
            }
        }
        
        return count;
    }
    
    public void DisplayHE()
    {
        for(int i = 0; i < count; i++){
            if(empList[i] instanceof HourlyEmployee h){
               h.displayHourlyEmployee();
            }
        }
    }
    
    public void DisplayCE()
    {
        for(int i = 0; i < count; i++){
            if(empList[i] instanceof CommissionEmployee c){
               c.displayCommissionEmployee();
            }
        }
    }
    
    public void DisplayBCPE()
    {
        
    }
    
    public void DisplayPWE()
    {
        for(int i = 0; i < count; i++){
            if(empList[i] instanceof PieceWorkEmployee p){
               p.displayPWEmployee();
            }
        }
    }
    
    public void DisplayAllEmployee()
    {
        
    }
    
}
