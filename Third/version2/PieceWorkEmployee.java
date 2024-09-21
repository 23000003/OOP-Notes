/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version2;

/**
 *
 * @author User
 */
public class PieceWorkEmployee extends Employee {
    
    private int totalPiecesFinished;
    private double ratePerPiece;

    public PieceWorkEmployee() {
    }

    public PieceWorkEmployee(String empName, int empID) {
        this(0,0, empName, empID);
    }

    public PieceWorkEmployee(int totalPiecesFinished, double ratePerPiece) {
        this(totalPiecesFinished, ratePerPiece, null, 0);
    }

    public PieceWorkEmployee(int totalPiecesFinished, double ratePerPiece, String empName, int empID) {
        super(empName, empID);
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }
   
    
}