//Write a Java program that calculates the factorial of a number using a recursive method.

import java.util.Scanner;

class ass6{
    static int factorial(int num){
        if(num==0||num==1){
            return 1;
        }
        return num*factorial(num-1);
    }
    public static void main(String[] args){
        System.out.println("Enter number ");
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        System.out.println("Factorail of num "+factorial(num));

        
    }
}