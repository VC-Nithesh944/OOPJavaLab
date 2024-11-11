package mypack;

public class Myaccount{
    double balance ;
    String name;
    public Myaccount(String name, double balance){
        this.name = name ;
        this.balance = balance;
    }

    public void display(){
        if (balance < 0){
            System.out.println("NO balance");

        }
        else {
            System.out.println("The balance is : " + balance);
        }
    }
}
