/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;

public class History {
    private Goods product;
    private Owner owner;
    private Date givenDate;
    private Date returnDate;

    public History() {
    }

    public Goods getProduct() {
        return product;
    }

    public void setProduct(Goods product) {
        this.product = product;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Date getGivenDate() {
        return givenDate;
    }

    public void setGivenDate(Date givenDate) {
        this.givenDate = givenDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "History{"
                + "\nProduct=" + product.toString()
                + ",\nOwner=" + owner.toString()
                + ",\n givenDate=" + givenDate.toString()
                + ",\n returnDate=" + returnDate
                + "\n}";
    }
    
}
