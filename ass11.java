//Write a Java program to calculate the area of a rectangle using user-input length and width values.

import java.util.Scanner;

public class ass11 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length and width of rectangle");
        int lenght=sc.nextInt();
        int width=sc.nextInt();
       // System.out.println("Area of Rectangle");
        int area=lenght*width;
        System.out.println("Area of rectangle "+area);
    }
}
