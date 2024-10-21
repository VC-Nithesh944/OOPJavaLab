import java.util.*;
class Account {
    String customerName;
    int accountNumber;
    String accountType;
    double balance;
    Account(String customerName, int accountNumber, String accountType, double balance){
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }
}

class SavingsAccount extends Account{
    double interest = 0.04;
    SavingsAccount(String name, int accountnumber, String type, double balance){
        super(name, accountnumber, "savings", balance);
    }

    void Deposit(double balance,double amount){
        balance += amount;
        System.out.println("Amount deposited Successfully!!");
        System.out.println("The new balance is : "+balance);
    }

    void Withdraw(double balance,double Amount){
        if (balance >= Amount){
            balance -= Amount;
            System.out.println("Amount Withdrawn Successfully!!");
            System.out.println("The new Balance is: "+balance);
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }

    void FinalBalance(double amount , int years){
        amount = amount * Math.pow((1+interest),years);
        System.out.println("The final balance after "+years+" years is: "+amount);
    }
}

class CurrentAccount extends Account{
    CurrentAccount(String name, int accountnumber, String type, double balance){
        super(name, accountnumber, "current", balance);
    }
    double minbalance = 1000.00;
    double serviceCharge = 500;

    void Withdraw(double balance,double Amount){
        if (balance >= Amount){
            balance -= Amount;
            System.out.println("Amount Withdrawn Successfully!!");
            System.out.println("The new Balance is: "+balance);
        }
        else{
            System.out.println("Insufficient Balance");
        }
        if(balance < minbalance){
            balance -= serviceCharge;
            System.out.println("Service charge deducted!!");
            System.out.println("The new balance is : "+balance);
        }
    }

    void Deposit(double balance,double amount){
        balance += amount;
        System.out.println("Amount deposited Successfully!!");
        System.out.println("The new balance is : "+balance);
    }

}

class BankAccount{
    public static void main(String[] args) {
        System.out.println("Enter the customer name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println();
        System.out.println("Enter the account number: ");
        int accountnumber = input.nextInt();
        System.out.println("what type of account do you want to open (current or savings): ");
        String type = input.next();
        System.out.println("Enter the Initial amount you want to enter: ");
        double balance= input.nextDouble();
        
        if (type == "current"){
            while(true){
            CurrentAccount acc1 = new CurrentAccount(name, accountnumber, type, balance);
            System.out.println("You have created a current account successfully !!");
            System.out.println("What do you want to do: \n1.Withdraw \n2.Deposit \n3.quit");
            System.out.println("Enter your Choice: ");
            int choice = input.nextInt();
            switch(choice){
            case 1: System.out.println("Enter the amount you want to withdraw: ");
            double amount  = input.nextDouble();
            acc1.Withdraw(balance,amount);
            break;
            case 2: System.out.println("Enter the amount you want to Deposit: ");
            amount = input.nextDouble();
            acc1.Deposit(balance,amount);
            break;
            case 3:
            return;
            default : System.out.println("Invalid entry!!,Try again");
            break;
                }
            }
        }
        else{
            while(true){
                SavingsAccount acc1 = new SavingsAccount(name, accountnumber, type, balance);
                System.out.println("What do you want to do: \n1.Withdraw \n2.Deposit\n3.compound interest\n4.quit");
                System.out.println("Enter your Choice: ");
                int choice = input.nextInt();
                switch(choice){
                case 1: System.out.println("Enter the amount you want to withdraw: ");
                double amount  = input.nextDouble();
                acc1.Withdraw(balance,amount);
                break;
                case 2: System.out.println("Enter the amount you want to Deposit: ");
                amount = input.nextDouble();
                acc1.Deposit(balance,amount);
                break;
                case 3: System.out.println("enter the amount : ");
                amount = input.nextDouble();
                System.out.println("Enter the number of years; ");
                int years = input.nextInt();
                acc1.FinalBalance(amount,years);
                case 4:
                return;
                default : System.out.println("Invalid entry!!,Try again");
                break;
                }
            }
        }
        
    }
}
