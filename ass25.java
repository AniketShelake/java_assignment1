//write a Java program that reads an integer and check whether it is negative, zero, or
//positive

import java.util.Scanner;

public class ass25 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num<0){
            System.out.println("Entered number is negative");
        }
        else if(num>0){
            System.out.println("Entered number is positive");
        }
        else{
            System.out.println("Number is zero");
        }
    }
}
