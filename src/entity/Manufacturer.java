/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;

public class Manufacturer implements Serializable{
    private String nameCompany;
    private int year;
    private int day;
    private int month;
    
    public Manufacturer() {
    }

    public String getnameCompany() {
        return nameCompany;
    }

    public void setnameCompanyName(String nameCompany) {
        this.nameCompany = nameCompany;
    }
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "Manufacturer{" 
                + "name=" + nameCompany 
                + ", year=" + year 
                + ", day=" + day 
                + ", month=" + month 
                + '}';
    }
    
    
}
