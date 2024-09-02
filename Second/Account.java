/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bank;

/**
 *
 * @author User
 */
public class Account {
    private double currBalance = 0; // deposit (should be deducted when withdraw triggered)
    private double availableBalance = 0; // withdraw 
    private String accountName;
    private int accountNumber;

    public Account(String accountName, int accountNumber) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
    }

    // CHECK BALANCE
    public double getCurrBalance() {
        return currBalance;
    }

    // CHECK BALANCE
    public double getAvailableBalance() {
        return availableBalance;
    }

    
    public void verifyCurr(){
        this.availableBalance = this.currBalance;
    }
    
    private boolean divisibleBy(double amount){
        return amount % 100 == 0;
    }
    
    public boolean deposit(double amount){
        if(!divisibleBy(amount)) return false;
        
        this.currBalance += amount;
        return true;
    }
    
    public boolean withdraw(double amount){
      
        if(!divisibleBy(amount)) return false;
        
        if((this.availableBalance - (amount + 10) ) <= 0){
            return false;
        }else{
            this.availableBalance -= (amount + 10);
            return true;
        }
    }
    
    public boolean transfer(Account another, double amount){
        if(!divisibleBy(amount)) return false;
        
        another.currBalance += amount;
        
        return withdraw(amount);
    }

    @Override
    public String toString() {
        
        // Becomes in ONE string
//        StringBuilder sb = new StringBuilder();
//        sb.append("ID: ");
//        sb.append(sb);
//        sb.append("\n");
//        
//        return sb.toString();
        
        return "Account ID: " + this.accountNumber + "\nAccount Name: " + this.accountName + "\nCurrent Balance: " + 
                this.currBalance + "\nAvailable Balance: " + this.availableBalance + "\n";
    }
   
    public void display(){
        System.out.println(this.toString());
    }
    
}















