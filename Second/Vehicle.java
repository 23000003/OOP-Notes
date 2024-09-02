/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bank;

/**
 *
 * @author User
 */
public class Vehicle {
    private int topSpeed;
    private int currSpeed;
    private String color;
    private String model;
    private String manufacturer;
    private String plateNumber;
    private boolean disabled = false;
    
    
    public Vehicle(int topSpeed, int currSpeed, String color, String model, String manufacturer, String plateNumber, boolean disabled) {
        this.topSpeed = topSpeed;
        this.currSpeed = currSpeed;
        this.color = color;
        this.model = model;
        this.manufacturer = manufacturer;
        this.plateNumber = plateNumber;
        this.disabled = disabled;
    }
    
    public void repairCar(){
       this.disabled = false;
    }
    
    public boolean accelarate(){ // increments by 10
        
        if(!this.disabled) return false;
        
        if((this.currSpeed + 10) >= this.topSpeed){
            this.disabled = true;
            return false;
        }else{
            this.currSpeed += 10;
            return true;
        }
    }
    
    public boolean decelerate(){
        if((this.currSpeed - 10) < 0){
            return false;
        }else{
            this.currSpeed -= 10;
            return true;
        }
    }

    @Override
    public String toString() {
        return "The " + this.color + " " + this.model + " with a Plate No. " + 
                this.plateNumber + " is accelerating from 0Kph to " + this.currSpeed + "Kph\n";
    }

    
    public void display(){
        System.out.println(this.toString());
    }

}










