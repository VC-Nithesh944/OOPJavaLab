import java.util.*;
public class Eshop{
    String name; public double price; double amount; 
    void accept(){
        System.out.print("Enter your name: ");
        name = new Scanner(System.in).nextLine();
        System.out.print("Enter the price of the item you bought : ");
        price = new Scanner(System.in).nextDouble();
    }

    void calculate(){
        if (price >= 1000 || price <= 25000)
        amount =price -(price * 0.05) ;
        else if (price >= 25001 || price <= 57000)
        amount = price - (price * 0.075);
        else if (price >= 57001 || price <= 100000)
        amount = price - (price * 0.1);
        else if (price >100000)
        amount =price - (price * 0.15);
    }

    void display(){
        System.out.println("The discount price is : "+amount);
    }
}

class EshopDemo{
    public static void main(String[] args) {
        Parse item1= new Parse();
        item1.accept();
        item1.calculate();
        item1.display();
    }
}
