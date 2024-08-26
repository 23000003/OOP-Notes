/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package timer;

/**
 *
 * @author Kenny
 */
public class HookTimer {
    
    private int hours;
    private int minutes;
    private int seconds;
    private boolean meridian = true; //true = AM false == PM
    
    public int getHours(){
        return this.hours;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public int getSeconds() {
        return this.seconds;
    }

    public boolean getMeridian() {
        return this.meridian;
    }

    public HookTimer(int hours, int minutes, int seconds) {

        int extraMins = seconds / 60;
        this.seconds = seconds % 60;

        minutes += extraMins;
        int extraHrs = minutes / 60;
        this.minutes = minutes % 60; 
        
        int comp = (hours + extraHrs) % 12;
        
        this.hours = comp == 0 ? 1 : comp;
        this.meridian = ((hours + extraHrs) / 12) % 2 == 0;
    }
    
    public String printTimer(){
        return String.format("%02d:%02d:%02d:%s", 
                this.hours, this.minutes, this.seconds, this.meridian ? "AM" : "PM");
    }
    
    public void tickBySecond(){

        this.seconds += 1;
        if(this.seconds == 60){
            this.seconds = 0;
            tickByMinute();
        }
    }
    
    public void tickByMinute(){
     
        this.minutes += 1;
        if(this.minutes == 60){
            this.minutes = 0;
            tickByHour();
        }
    }
    
    public void tickByHour(){
   
        this.hours += 1;
        if(this.hours > 12){
            this.hours -= 12;
            this.meridian = !this.meridian;
        }
    }
    
    public void advanceTime(int seconds){
        this.seconds += seconds;
        int extra = this.seconds / 60;
        this.seconds %= 60;
        
        if(extra >= 1){
            for(int i = 0; i < extra; i++){
                tickByMinute();
            }
        }
    }
}
