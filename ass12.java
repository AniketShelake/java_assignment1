//Create a Java program that converts temperature from Celsius to Fahrenheit and vice versa,
// using appropriate conversion formulas
//c=5/9(F-32)
//f=9/5*c+32

import java.util.Scanner;

public class ass12 {
  public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter temp in celsius ");
      int cel = sc.nextInt();
     float far=(9*cel)/5+32;
     System.out.println("Temrature in Far "+ far);
     System.out.println("Enter tem in far");
     int far1=sc.nextInt();
     float cel1=(5*(far1-32))/9;
     System.out.println("Temprature in celcius "+cel1);
  }  
}
