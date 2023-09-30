//Write a Java program that takes a double as input and rounds it to the nearest integer using type casting.

import java.util.Scanner;

public class ass14 {
    public static void main(String[] args){
        System.out.println("Enter any double value ");
        Scanner sc= new Scanner(System.in);
        double a=sc.nextDouble();
        if(a%1<0.5){
            int b=(int)a;
        System.out.println(b);
        }
        else{
            int b=(int)a+1;
        System.out.println(b);
        }
       
    }
}
