package keeper;
/////////////////////////////
import entity.Goods;      ///
import entity.History;    ///
import entity.Owner;      ///
import interfaces.Keeping;///
/////////////////////////////
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileKeeper implements Keeping{

    @Override
    public void saveGoods(List<Goods> product) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("product");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(product);
            oos.flush();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileKeeper.class.getName()).log(Level.SEVERE, "Нет файла product", ex);
        } catch (IOException ex) {
            Logger.getLogger(FileKeeper.class.getName()).log(Level.SEVERE, "Ошибка ввода данных", ex);
        }
    }
    @Override
    public List<Goods> loadGoods() {
        List<Goods> listProduct = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("Product");
            ois = new ObjectInputStream(fis);
            listProduct = (List<Goods>) ois.readObject();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileKeeper.class.getName()).log(Level.SEVERE, "Нет файла Product", ex);
        } catch (IOException ex) {
            Logger.getLogger(FileKeeper.class.getName()).log(Level.SEVERE, "Ошибка ввода", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FileKeeper.class.getName()).log(Level.SEVERE, "Нет такого класса", ex);
        }
        return listProduct;
    }


    @Override
    public void saveOwners(List<Owner> owners) {
         FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("owner");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(owners);
            oos.flush();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileKeeper.class.getName()).log(Level.SEVERE, "Нет файла owners", ex);
        } catch (IOException ex) {
            Logger.getLogger(FileKeeper.class.getName()).log(Level.SEVERE, "Ошибка ввода данных", ex);
        }
    }
    

    @Override
    public List<Owner> loadOwner() {
                 List<Owner> listOwner = new ArrayList<>();

        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("Owner");
            ois = new ObjectInputStream(fis);
            listOwner = (List<Owner>) ois.readObject();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileKeeper.class.getName()).log(Level.SEVERE, "Нет файла Owner", ex);
        } catch (IOException ex) {
            Logger.getLogger(FileKeeper.class.getName()).log(Level.SEVERE, "Ошибка ввода", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FileKeeper.class.getName()).log(Level.SEVERE, "Нет такого класса", ex);
        }
        return listOwner;
    }
    

    @Override
    public void saveHistories(List<History> histories) {
         FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("historyBui");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(owners);
            oos.flush();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileKeeper.class.getName()).log(Level.SEVERE, "Нет файла owners", ex);
        } catch (IOException ex) {
            Logger.getLogger(FileKeeper.class.getName()).log(Level.SEVERE, "Ошибка ввода данных", ex);
        }
    }

    @Override
    public List<History> loadHistories() {
        List<History> listHistory = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("History");
            ois = new ObjectInputStream(fis);
            listHistory = (List<History>) ois.readObject();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileKeeper.class.getName()).log(Level.SEVERE, "Нет файла Owner", ex);
        } catch (IOException ex) {
            Logger.getLogger(FileKeeper.class.getName()).log(Level.SEVERE, "Ошибка ввода", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FileKeeper.class.getName()).log(Level.SEVERE, "Нет такого класса", ex);
        }
        return listOwner;
        
        return loadHistories;
    }

}