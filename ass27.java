// Write a program that accepts three numbers from the user and prints "increasing" 
// if the numbers are in increasing order, "decreasing" if the numbers are
//  in decreasing order, and "Neither increasing or decreasing order" otherwise.

import java.util.Scanner;

public class ass27 {
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any three number");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    if(a<b&&b<c){
        System.out.println("Number is in increasing order");
    }
    else if(a>b&&b>c){
        System.out.println("Number is in decreasing order");
    }
    else{
        System.err.println("Neither increasing or decreasing order");
    }
   } 
}
