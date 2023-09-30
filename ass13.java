//Develop a Java program that calculates the sum of two integers and
// displays the result as a double. Ensure there's no loss of precision.

import java.util.Scanner;

public class ass13 {
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    double c=a+b;
    System.out.println("Addition of two numbers "+c);
  }  
}
