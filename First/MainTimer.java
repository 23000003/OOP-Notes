/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package timer;

/**
 *
 * @author Kenny
 */
public class MainTimer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        HookTimer myTime = new HookTimer(24, 159, 141);
        System.out.println(myTime.printTimer());
        myTime.tickByMinute();
        System.out.println(myTime.printTimer());
        myTime.tickBySecond();
        System.out.println(myTime.printTimer());
        myTime.tickByHour();
        System.out.println(myTime.printTimer());
        myTime.advanceTime(50000);
        System.out.println(myTime.printTimer());
        myTime.advanceTime(27000);
        System.out.println(myTime.printTimer());
    }
    
}
