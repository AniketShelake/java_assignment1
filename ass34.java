// Write a Java program that prompts the user to enter a password (e.g., "password123") 
// and keeps prompting until the correct password is entered.

import java.util.Scanner;

public class ass34{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str1="password123";
        boolean flag=true;
        do{
        System.out.println("Enter the password");
        String str=sc.nextLine();
        
        
        if(str.equals(str1)){
            System.out.println("Correct password is entered");
            flag=false;
        }
        
        else{
            System.out.println("Password is incorrect");
            flag=true;
            
        }
    }while(flag);
    }
}