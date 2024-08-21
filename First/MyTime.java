/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstproj;

/**
 *
 * @author User
 */

//behaviors => methods on what the class is doing
//ex. person => Singing

public class MyTime {
    //properties => variables
    //public means accessable anywhere
    //public int hours;
    //public int minutes;
    
    private int hours;
    private int minutes;
    private int seconds;
    private boolean meredian = false; // ASsignment
    
    public void setHours(int hours){
        this.hours = (hours <= 12 && hours > 0) ? hours : 12;
    }
    
    public int getHours(){
        return hours; // can be this.hours since hours is siya ra usa
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = (minutes <= 60 && minutes >= 0) ? minutes : 0;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = (seconds <= 60 && seconds >= 0) ? seconds : 0;
    }
    
    
//    @Override
    public String toStringx(){
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.hours;
        hash = 97 * hash + this.minutes;
        hash = 97 * hash + this.seconds;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MyTime other = (MyTime) obj; // constant
        if (this.hours != other.hours) {
            return false;
        }
        if (this.minutes != other.minutes) {
            return false;
        }
        return this.seconds == other.seconds;
    }
    
    //def constructor
    public MyTime(){
        
    }
    
    //default constructor
    public MyTime(int hr, int min, int sec){
        setHours(hr);
        setMinutes(min);
        setSeconds(sec);
    }
    
    
    // ASSIGNMENT
    //12:59:59 => 1:00:00
    public void tickBySecond(){
        //ASSIGNMENT
        this.seconds += 1;
        
    }
    
    public void tickByMinute(){
        //ASSIGNMENT
        if(this.seconds >= 60){
            this.seconds = 0;
            this.minutes += 1;
        }
    }
    
    public void tickByHour(){
        //ASSIGNMMENT
        if(this.minutes >= 60){
            this.hours += 1;

            if(this.hours >= 12){
                this.hours = 1;
                this.meredian = true;
            }
        }
    }
    
    public void advanceTime(int seconds){ // advances time using the current time
        //ASSIGNMENT
        this.seconds += seconds;
        
        if(this.seconds >= 60){
            int tempSeconds = this.seconds;
        }
        //use modulo
    }
}
