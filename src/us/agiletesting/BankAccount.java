package us.agiletesting;

import java.util.Scanner;

public class BankAccount {

    int balance;
    int transaction;
    String customerName;
    String customerId;

    public BankAccount(String customerName, String customerId){
        this.customerName = customerName;
        this.customerId = customerId;
    }

    void deposit(int amount){
        if (amount !=0){
            balance = balance + amount;
            transaction = amount;
        }
    }
    void withdraw(int amount){
        if(amount!=0){
            balance = balance - amount;
            transaction = - amount;
        }
    }
    void getTransaction(){
        if(transaction > 0){
            System.out.println("Deposited: "+transaction);
        } else if(transaction < 0 ){
            System.out.println("Withdrawn: "+Math.abs(transaction));
        } else {
            System.out.println("No transaction occurred");
        }
    }
    void showMenu(){
        char options = '\0';
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome " + customerName);
        System.out.println("Your ID is " + customerId);
        System.out.println("\n");
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Transaction");
        System.out.println("E. Exit");

        do {

            System.out.println("==================================");
            System.out.println("Choose one of the options");
            System.out.println("==================================");
            options = scanner.next().charAt(0);
            System.out.println("\n");

            switch (options){

                case 'A':
                    System.out.println("------------------------------");
                    System.out.println("Balance = "+balance);
                    System.out.println("------------------------------");
                    break;
                case 'B':
                    System.out.println("------------------------------");
                    System.out.println("Enter an amount to deposit:");
                    System.out.println("------------------------------");
                    int depositAmount = scanner.nextInt();
                    deposit(depositAmount);
                    System.out.println("\n");
                    break;
                case 'C':
                    System.out.println("------------------------------");
                    System.out.println("Enter an amount to withdraw:");
                    System.out.println("------------------------------");
                    int withdrawAmount = scanner.nextInt();
                    withdraw(withdrawAmount);
                    System.out.println("\n");
                    break;
                case 'D':
                    System.out.println("------------------------------");
                    getTransaction();
                    System.out.println("------------------------------");
                    System.out.println("\n");
                    break;
                case 'E':
                    System.out.println("------------------------------");
                    break;
                default:
                    System.out.println("Invalid Option!! Please try again!");
                    break;
            }
        } while (options != 'E');
        System.out.println("Thank you for choosing us for your banking services! See you soon!");



    }
}
