/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

public class Owner {
    private String firstname;
    private String lastname;
    private String phone;
    private int money;
    public Owner() {
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    @Override
    public String toString() {
        return "Owner{" 
                + "firstname=" + firstname
                + ",\n lastname=" + lastname 
                + ",\n phone=" + phone
                + ",\n money=" + money
                + "\n}";
    }
    
}
