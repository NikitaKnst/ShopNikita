package myclasses;
////Импорт классов///////////////
import entity.Owner;          //
import entity.Goods;         // 
import entity.History;      //
import entity.Manufacturer;//
////////////////////////////

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;
import keeper.FileKeeper;

public class App {
    Scanner scanner = new Scanner(System.in);
    List<Goods> product = new ArrayList<>();
    List<Owner> owners = new ArrayList<>();
    List<History> histories = new ArrayList<>();
    FileKeeper fileKeeper = new FileKeeper();

    public App() {
        product = fileKeeper.loadGoods();
        owners = fileKeeper.loadOwner();
    }
    
    public void run(){
        String repeat = "y";
        do{
            System.out.println("Выберите задачу: ");
            System.out.println("0: Закончить программу");
            System.out.println("1: Добавить товар");
            System.out.println("2: Список товаров");
            System.out.println("3: Добавить покупателя");
            System.out.println("4: Список покупателей");
            System.out.println("5: Выдать товар");
            System.out.println("6: Список проданных товаров");
            
            int task = scanner.nextInt();
            scanner.nextLine();
            switch (task) {
                case 0: 
                    repeat="q";
                    System.out.println("Программа закончена");
                    break;
                case 1: 
                    System.out.println("Добавление товаров: ");
                    product.add(addProduct());
                    fileKeeper.saveGoods(product);
                    break;
                case 2: 
                    System.out.println("Список товаров: ");
                    for (int i = 0; i < product.size(); i++) {
                        if(product.get(i) != null){
                            System.out.println(product.get(i).toString());
                        }
                    }
                    break;
                case 3: 
                    System.out.println("Добавление покупателя: ");
                    owners.add(addOwner());                   
                    break;
                case 4: 
                    System.out.println("Список покупателей: ");
                    for (int i = 0; i < owners.size(); i++) {
                        if(owners.get(i) != null){
                            System.out.println(owners.get(i).toString());
                        }
                    }
                    break;
                case 5: 
                    System.out.println("Выдача товаров: ");
                    histories.add(addHistory());
                    break;
                case 6: 
                    printGivenGoods();
                    break;
            }
        }while("y".equals(repeat));
    }
    private void printGivenGoods(){
        System.out.println("Список выданных товаров: ");
        for (int i = 0; i < histories.size(); i++) {
            if(histories.get(i) != null && histories.get(i).getReturnDate() == null){
                System.out.printf("%d. Товар: %s купил %s %s%n",
                        i+1,
                        histories.get(i).getProduct().getCaption(),
                        histories.get(i).getOwner().getFirstname(),
                        histories.get(i).getOwner().getLastname()
                );

            }
        }
    }
     private History addHistory(){
        History history = new History();
        System.out.println("Список товара: ");
        for (int i = 0; i < product.size(); i++) {
            if(product.get(i) != null){
                System.out.printf("%d. %s%n",i+1,product.get(i).toString());
            }
        }
        System.out.print("Введите номер товара: ");
        int productNumber = scanner.nextInt(); scanner.nextLine();
        history.setProduct(product.get(productNumber-1));
        System.out.println();
        System.out.println("Список покупателя: ");
        for (int i = 0; i < owners.size(); i++) {
            if(owners.get(i) != null){
                System.out.printf("%d. %s%n",i+1,owners.get(i).toString());
            }
        }
        System.out.print("Введите номер покупателя: ");
        int ownerNumber = scanner.nextInt(); scanner.nextLine();
        history.setOwner(owners.get(ownerNumber-1));
        Calendar c = new GregorianCalendar();
        history.setGivenDate(c.getTime());
        return history;
    }
     
     
     private Owner addOwner(){
        Owner owners = new Owner();
        System.out.print("Введите имя покупателя: ");
        owners.setFirstname(scanner.nextLine());
        System.out.print("Введите фамилию покупателя: ");
        owners.setLastname(scanner.nextLine());
        System.out.print("Введите номер телефона покупателя: ");
        owners.setPhone(scanner.nextLine());
         System.out.print("Введите кол-во денег у покупателя: ");
        owners.setMoney(scanner.nextInt());
        return owners;
    }
     private Goods addProduct(){
        Goods product = new Goods();
        System.out.print("Введите название товара: ");
        product.setCaption(scanner.nextLine());
        System.out.print("Введите цену товара: ");
        product.setProductprice(scanner.nextInt());
        scanner.nextLine();
        List<Manufacturer> manufacturer = new ArrayList<>();
        for (int i = 0; i < 1; i++) {
            Manufacturer manufact = new Manufacturer();
            System.out.print("Имя компании: ");
            manufact.setnameCompanyName(scanner.nextLine());           
            System.out.print("Год появление товара: ");
            manufact.setYear(scanner.nextInt());
            System.out.print("День появление товара: ");
            manufact.setDay(scanner.nextInt());
            System.out.print("Месяц появление товара: ");
            manufact.setMonth(scanner.nextInt());
            scanner.nextLine();
            manufacturer.add(manufact);
        }
        product.setManufactur(manufacturer);
        return product;
    }
}
