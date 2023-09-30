// Write a Java program that checks if a given year is a leap year or not.
//  (Leap years are divisible by 4, but not divisible by 100, unless they are also divisible by 400.)

import java.util.Scanner;

public class ass30 {
    public static void main(String[] args){
        System.out.println("Enter year");
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if((year%4==0&&year%100!=0)||year%400==0){
           System.out.println("This is leap year");
        }
        else{
            System.out.println("This is not leap year");
        }
    }
}
