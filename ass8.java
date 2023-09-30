//Develop a Java program that calculates the average of three integers, but the result should be a double.

import java.util.Scanner;

public class ass8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("Average of three numbers");
        double avg=(a+b+c)/3;
        System.out.println("Average of three number "+avg);
    }
}
