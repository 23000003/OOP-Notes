/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employee.version1;

/**
 *
 * @author User
 */
public class PieceWorkEmployee {
    private int totalPiecesFinished;
    private double ratePerPiece;
    private String empName;
    private int empID;
    
    private double computeSalary(){
//        -> total pieces fionished * rate per piece
//        -> in every hundred pieces finished an aditional bonus of 10*rate per piece
        int bonus = this.totalPiecesFinished % 100;
        
        double total = bonus != 0 ? (this.totalPiecesFinished + bonus) * this.ratePerPiece : this.totalPiecesFinished * this.ratePerPiece;
        
        return total;
    }
    
    public void displayHourlyEmployee(){
        System.out.println(this.toString());
    }
    
    @Override
    public String toString(){
         return "Employee Name: " + this.empName + "\n Employee ID: " + this.empID + "\nTotal Pieces Finished: " + this.totalPiecesFinished
                 + "\nRate per piece: " + this.ratePerPiece + "\nTotal Salary: " + this.computeSalary();
    }

    public PieceWorkEmployee(int totalPiecesFinished, double ratePerPiece, String empName, int empID) {
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
        this.empName = empName;
        this.empID = empID;
    }
    
  
    
}
