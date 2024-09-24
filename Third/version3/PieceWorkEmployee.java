/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version3;

/**
 *
 * @author User
 */
public class PieceWorkEmployee extends Employee {
    
    private int totalPiecesFinished;
    private double ratePerPiece;

    public PieceWorkEmployee() {
    }

    public PieceWorkEmployee(Employee nEmp) {
        this(0,0, nEmp.getEmpName(), nEmp.getEmpID());
    }
    
    public PieceWorkEmployee(String empName, int empID) {
        this(0,0, empName, empID);
    }

    public PieceWorkEmployee(int totalPiecesFinished, double ratePerPiece) {
        this(totalPiecesFinished, ratePerPiece, null, 0);
    }

    public PieceWorkEmployee(int totalPiecesFinished, double ratePerPiece, Employee nEmp) {
        this(totalPiecesFinished, ratePerPiece, nEmp.getEmpName(), nEmp.getEmpID());
    }
    
    public PieceWorkEmployee(int totalPiecesFinished, double ratePerPiece, String empName, int empID) {
        super(empName, empID);
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public double getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(double ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }
   
    private double computeSalary() {
//        -> total pieces fionished * rate per piece
//        -> in every hundred pieces finished an aditional bonus of 10*rate per piece
        int bonus = this.totalPiecesFinished / 100;
        
        double total = bonus != 0 ? (this.totalPiecesFinished + bonus) * this.ratePerPiece : this.totalPiecesFinished * this.ratePerPiece;
        
        return total; 
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        sb.append(super.toString());
        sb.append("Total Pieces Finished: ").append(this.totalPiecesFinished).append("\n");
        sb.append("Rate Per Piece: ").append(this.ratePerPiece).append("\n");
        sb.append("Computed Salary: ").append(this.computeSalary()).append("\n");
        return sb.toString();
    }
    
    public void displayPWEmployee(){
        System.out.println(this);
    }
}