//Create a Java program that calculates the factorial of a given number using a for loop.

import java.util.Scanner;

class ass29{
    static int factorial(int num){
        
         int fact=1;
        for(int i=1;i<=num;i++){
             fact=fact*i;
            
        }
        return fact;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Factorial of number "+factorial(num));
    }
}