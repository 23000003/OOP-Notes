/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version3;

/**
 *
 * @author Kenny
 */
public class Date {
    private int Year;
    private int Month;
    private int Day;

    public Date(int Year, int Month, int Day) {
        this.Year = Year;
        this.Month = Month;
        this.Day = Day;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public int getMonth() {
        return Month;
    }

    public void setMonth(int Month) {
        this.Month = Month;
    }

    public int getDay() {
        return Day;
    }

    public void setDay(int Day) {
        this.Day = Day;
    }
    
}
