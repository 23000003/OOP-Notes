/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bank;

/**
 *
 * @author User
 */
public class Bank {
    
//    public Account(double currBalance, double balance, String accountName, int accountNumber)

    public static void main(String[] args) {
        Account ac1 = new Account("Kenny", 23000003);
        Account ac2 = new Account("JOE HARRY", 23023521);
        ac1.display();
        ac1.deposit(11000);
        ac1.verifyCurr();
        System.out.println((ac1.withdraw(10000)) ? "Success" : "Failed");
        ac1.display();
        ac2.display();
        ac1.transfer(ac2, 1000);
        ac2.display();
        ac1.display();
        
//        // CHECK BALANCE
//        System.out.println(ac1.getCurrBalance());
        
//        public Vehicle(int topSpeed, int currSpeed, String color, String model, String manufacturer, String plateNumber, boolean disabled)

        Vehicle vc1 = new Vehicle(200, 30, "RED", "BMW", "Sa Amoa", "123-345", false);
        vc1.display();
        System.out.println((vc1.accelarate()) ? "" : "Failed");
        vc1.display();
    }
}
