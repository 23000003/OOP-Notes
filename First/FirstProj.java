/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.firstproj;

/**
 *
 * @author User
 */
public class FirstProj {

    public static void main(String[] args){
        
        MyTime time = new MyTime();
        MyTime time1 = new MyTime(10, 20, 30);
//        time.hours = 10;
//        time.minutes = 30;
//        
//        System.out.println(time.hours + ":" + time.minutes);

        time.setHours(70);
        time.setMinutes(53);
        time.setSeconds(65);
        
//        time1.setHours(70);
//        time1.setMinutes(53);
//        time1.setSeconds(65);
        
//        System.out.println(time.getHours() + ":" + time.getMinutes() + ":" + time.getSeconds());
//        System.out.println(time); // cuz of @Override prints the toString function instead of the address of the class
          System.out.println(time.toStringx()); // same with above but no Override
          System.out.println(time1.toStringx());
          
          // How to compare each object?
          System.out.println(time == time1); // false since its addresses is diff 
          System.out.println(time.equals(time1)); // true from @ovveride object // insert code method
    }
}
