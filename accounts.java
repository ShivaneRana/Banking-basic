//this is a account class which contain all the variable and fuction.

import java.util.Scanner;
public class accounts{
    Scanner scanner = new Scanner(System.in);
    String name;
    double balance;
    double debt;
    double amount;
    String input;

    String pattern = "*";
    String repeat1 = pattern.repeat(120);

    public accounts(String name,double balance,double amount,double debt){
        this.name = name;
        this.balance = balance;
        this.amount = amount;
        this.debt = debt;
    };

    public void show_account_info(){
        pattern();
        System.out.println("Account holder: "+name);
        System.out.println("Current Balance: "+balance);
        System.out.println("Current debt: "+debt);
        pattern();
    }

    public void withdraw(){

        pattern();
        amount = 0;
        System.out.println("Current balance:"+balance);
        System.out.print("How much cash would you like to withdraw: ");
        amount = scanner.nextInt();
        while(amount>=balance){
            System.out.println("The Amount entered exceed balance amount");
            System.out.print("Please enter how much cash would you like to withdraw: ");
            amount = scanner.nextInt();
            System.out.println("Withdrew amount: "+amount);
            balance = balance-amount;
         }
        balance = balance-amount;
        System.out.println("Current balance has been updated to:"+balance);
        pattern();
    }
    public void depositcash(){
            pattern();
            amount = 0;
            System.out.println("Current balance:"+balance);
            System.out.print("How much cash would you like to deposit: ");
            amount = scanner.nextInt();
            while(amount<0){
                System.out.println("The Amount entered is in negative form");
                System.out.print("Please enter how much cash would you like to deposit: ");
                amount = scanner.nextInt();
                scanner.nextLine();
                balance = balance+amount;
        }
            balance = balance+amount;
            System.out.println("Current balance has been updated to:"+balance);
            pattern();
    }

    public void debtcollector(){
        pattern();
        amount = 0;
        if(debt>0){
            System.out.println("!A previous debt was detected in user account!");
            System.out.print("Would you like to continue current operation\nDebt amount will be deducted from account balance(y/n): ");
            input = scanner.nextLine();
            if(input.equalsIgnoreCase("y")) {
                System.out.println("Thank you For your understanding");
                System.out.println("Account Balance: "+balance);
                System.out.println("debt amount: "+debt);
                balance=balance - debt;
                debt = 0;
                System.out.println("Account balance after paying debt: "+balance);
            }

            else {
                System.out.println("Debt will be collected at later date automatically.");
            }
        }

        else{
            System.out.println("User do no have any prior debt");
            System.out.println("Current debt: "+debt);
            System.out.println("Current balance: "+balance);
        }

        pattern();
    }

    public void pattern(){
        System.out.println(repeat1);
    }

    public void choice(){
        boolean flag = true;
        while (flag == true){
            pattern();
            System.out.println("Choose one of the following accoring to your need~");
            System.out.println("1.Show Account information");
            System.out.println("2.Deposit cash");
            System.out.println("3.Withdraw cash");
            System.out.println("4.Check debt(if any)");
            System.out.println("5.Exit the app");
            System.out.print("Your Choice:  ");
            int input2 = scanner.nextInt();
            scanner.nextLine();
            pattern();

        switch (input2){
            case 1:
                show_account_info();
                break;

            case 2:
                depositcash();
                break;

            case 3:
                withdraw();
                break;

            case 4:
                debtcollector();
                break;
            case 5:
                System.out.println("Thank you for using this bank sevices.");
                pattern();
                flag = false;
                break;
        }
        }
    }
}