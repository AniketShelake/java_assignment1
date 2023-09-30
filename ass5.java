//Create a Java program with a method that checks whether a given number is prime or not. 
//Call this method to determine if a user-input number is prime.

import java.util.Scanner;

public class ass5 {
    public static boolean prime(int num){
        boolean isprime=true;
        for(int i=2; i<num-1;i++){
            if(num%i==0){
                isprime=false;
            }
        }
        return isprime;
    }
  public static void main(String[] args){
    System.out.println("Enter number to check number is prime or not");
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    boolean isprime=prime(n);
     if(isprime){
       System.out.println("Number is Prime");
     }
     else{
        System.out.println("Number is not prime");
     }
  }  
}
