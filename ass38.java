// Create a Java program that simulates a simple ATM machine. The program should allow 
// users to check their balance, deposit money, and withdraw money. Implement appropriate error 
// handling for invalid inputs.

import java.util.InputMismatchException;
import java.util.Scanner;

public class ass38 {
    public static void main(String[] args){
        int balance=0;
        System.out.println("Enter amount you want to deposite");

        Scanner sc=new Scanner(System.in);
        try{
        int deposite_money=sc.nextInt();
        
        balance=balance+deposite_money;
        System.out.println("Available balance in your account "+balance);
        System.out.println("Enter the amount you want to withdraw");
        }
        catch(InputMismatchException re){
            System.out.println("Enter valid input");
            System.out.println("Available balance in your account "+balance);
        System.out.println("Enter the amount you want to withdraw");
        }
        try{
        int withdraw_money=sc.nextInt();
        balance=balance-withdraw_money;
        System.out.println("Available balance in your account "+balance);
        }
        finally{
            System.out.println("Enter valid input");
        }

    }
}
