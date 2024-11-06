/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version5;

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
        this.Month = Month % 12 == 0 ? 12 : Month % 12;
        this.Day = Day % 30 == 0 ? 30 : Day % 30;
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
        this.Month = Month % 12 == 0 ? 12 : Month % 12;
    }

    public int getDay() {
        return Day;
    }

    public void setDay(int Day) {
        this.Day = Day % 30 == 30 ? 1 : Day % 30;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getYear()).append("/").append(this.getMonth())
                .append("/").append(this.getDay());
        
        return sb.toString();
    }
    
    public void displayDateDetails(){
        System.out.println(this); //toString() Override
    }
 
}
