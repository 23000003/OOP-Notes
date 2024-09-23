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

    // @Override
    public String toStringAccelerate() {
        StringBuilder sb = new StringBuilder();
        sb.append("The ").append(this.color).append(" ").append(this.model)
                .append(" with a Plate No. ").append(this.plateNumber).append(" is accelerating from 0Kph to ")
                .append(this.currSpeed).append("Kph");
        
        return sb.toString();
    }

    public String toStringDecelerate(){
        StringBuilder sb = new StringBuilder();
        sb.append("The ").append(this.color).append(" ").append(this.model)
                .append(" with a Plate No. ").append(this.plateNumber)
                .append(" is deccelerating from ").append(this.topSpeed).append(" to ")
                .append(this.currSpeed).append("Kph");
        
        return sb.toString();
    }

    public String carDetails(){
        StringBuilder sb = new StringBuilder();
        sb.append("Model: ").append(this.model).append("\n")
                .append("Plate Number: ").append(this.plateNumber).append("\n")
                .append("Color: ").append(this.color).append("\n")
                .append("Manufacturer: ").append(this.manufacturer).append("\n")
                .append("Top Speed: ").append(this.topSpeed).append("\n")
                .append("Current Speed: ").append(this.currSpeed).append("\n")
                .append("Disabled: ").append(this.disabled).append("\n");
        
        return sb.toString();
    }
    
    public void display(String disp){
        System.out.println(disp);
    }

}









