import java.util.*;

class Account {
    String customerName;
    int accountNumber;
    String accountType;
    double balance;

    Account(String customerName, int accountNumber, String accountType, double balance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }
}

class SavingsAccount extends Account {
    double interest = 0.04;

    SavingsAccount(String name, int accountnumber, double balance) {
        super(name, accountnumber, "savings", balance);
    }

    void Deposit(double amount) {
        this.balance += amount;
        System.out.println("Amount deposited Successfully!!");
        System.out.println("The new balance is : " + this.balance);
    }

    void Withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Amount Withdrawn Successfully!!");
            System.out.println("The new Balance is: " + this.balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void FinalBalance(int years) {
    double finalAmount = this.balance * Math.pow((1 + interest), years);
    System.out.println("The final balance after " + years + " years is: " + finalAmount);
    }

}

class CurrentAccount extends Account {
    double minbalance = 1000.00;
    double serviceCharge = 500;

    CurrentAccount(String name, int accountnumber, double balance) {
        super(name, accountnumber, "current", balance);
    }

    void Withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Amount Withdrawn Successfully!!");
            System.out.println("The new Balance is: " + this.balance);
        } else {
            System.out.println("Insufficient Balance");
        }
        if (this.balance < minbalance) {
            this.balance -= serviceCharge;
            System.out.println("Service charge deducted!!");
            System.out.println("The new balance is : " + this.balance);
        }
    }

    void Deposit(double amount) {
        this.balance += amount;
        System.out.println("Amount deposited Successfully!!");
        System.out.println("The new balance is : " + this.balance);
    }
}

public class BankAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the customer name: ");
        String name = input.nextLine();

        System.out.println("Enter the account number: ");
        int accountnumber = input.nextInt();

        System.out.println("What type of account do you want to open (current or savings): ");
        String type = input.next();

        System.out.println("Enter the Initial amount you want to deposit: ");
        double balance = input.nextDouble();

        if (type.equals("current")) {
            CurrentAccount acc1 = new CurrentAccount(name, accountnumber, balance);
            System.out.println("You have created a current account successfully!!");

            while (true) {
                System.out.println("What do you want to do: \n1.Withdraw \n2.Deposit \n3.quit");
                System.out.println("Enter your Choice: ");
                int choice = input.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Enter the amount you want to withdraw: ");
                        double withdrawAmount = input.nextDouble();
                        acc1.Withdraw(withdrawAmount);
                        break;
                    case 2:
                        System.out.println("Enter the amount you want to deposit: ");
                        double depositAmount = input.nextDouble();
                        acc1.Deposit(depositAmount);
                        break;
                    case 3:
                        return;
                    default:
                        System.out.println("Invalid entry!! Try again.");
                        break;
                }
            }
        } else if (type.equals("savings")) {
            SavingsAccount acc1 = new SavingsAccount(name, accountnumber, balance);
            System.out.println("You have created a savings account successfully!!");

            while (true) {
                System.out.println("What do you want to do: \n1.Withdraw \n2.Deposit\n3.Compound Interest\n4.quit");
                System.out.println("Enter your Choice: ");
                int choice = input.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Enter the amount you want to withdraw: ");
                        double withdrawAmount = input.nextDouble();
                        acc1.Withdraw(withdrawAmount);
                        break;
                    case 2:
                        System.out.println("Enter the amount you want to deposit: ");
                        double depositAmount = input.nextDouble();
                        acc1.Deposit(depositAmount);
                        break;
                    case 3:
                        System.out.println("Enter the number of years: ");
                        int years = input.nextInt();
                        acc1.FinalBalance(years);
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Invalid entry!! Try again.");
                        break;
                }
            }
        } else {
            System.out.println("Invalid account type!");
        }
    }
}
