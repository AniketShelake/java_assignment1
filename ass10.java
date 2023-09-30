//Create a Java program that takes two integers as input and performs addition, subtraction, 
//multiplication, and division on them, displaying the results.

import java.util.Scanner;

public class ass10 {
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter two numbers ");
    int a=sc.nextInt();
    int b=sc.nextInt();
    
    System.out.println("Addition of two number "+(a+b));
    System.out.println("Subtraction of two number "+(a-b));
    System.out.println("Multiplication of two number "+(a*b));
    System.out.println("Division of two number "+(a/b));
  }  
}
