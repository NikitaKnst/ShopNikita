/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;
import entity.Manufacturer;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class Goods implements Serializable{
    private String caption;
    private List<Manufacturer> manufacturer;
    private int price;
    
    public Goods() {
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public List<Manufacturer> getManufacturer() {
        return manufacturer;
    }

    public void setManufactur(List<Manufacturer> manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getProductprice() {
        return price;
    }

    public void setProductprice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" 
                + "caption=" + caption 
                + ",\n Price=" + price 
                + ",\n Company=" + Arrays.toString(manufacturer.toArray())                
                + "\n}";
    }
    
    
}
