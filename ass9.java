//Write a Java program to calculate the area of a circle using the 
//formula area = π * r * r, where r is the radius (input by the user).

import java.util.Scanner;

public class ass9 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter radius of circle");
        int radius=sc.nextInt();
        double area=3.14*radius*radius;
        System.out.println("Area of circle "+area);
    }
}
