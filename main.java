//this is a main.java file

import java.util.Scanner;
import java.util.ArrayList;

public class main{
    public static void main(String[]  args){
        Scanner scanner = new Scanner(System.in);
        String name = "";
        double balance = 0;
        double amount = 0;
        double debt = 0;
        boolean flag = true;
        while(flag == true){
            System.out.print("Enter account holder name: ");
            name = scanner.nextLine();
            System.out.print("Enter the balance amount: ");
            balance = scanner.nextDouble();
            System.out.print("Enter debt if any: ");
            debt = scanner.nextDouble();
            scanner.nextLine();
            if(name.isBlank() && balance<0 && debt <0){
                System.out.println("Some of the values were added incorrectly!");
                System.out.println("Please enter the details again");
            }
            else{
                System.out.println("Thank you for your cooperation all bank function will be available to you instanly!");
                flag = false;
            }
                }

            accounts acc1 = new accounts(name,balance,amount,debt);
            acc1.choice();
            }
        }