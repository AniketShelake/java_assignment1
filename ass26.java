// Write a Java program that accepts three numbers and prints "All numbers are equal" if all
// three numbers are equal, "All numbers are different" if all three numbers are different and
// "Neither all are equal or different

import java.util.Scanner;

class ass26{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a==b&&b==c&&a==c){
            System.out.println("All three numbers are eqaul");
        }
        
        else if(a==b||b==c||a==c){
            System.out.println("Neither all are equal or different");
        }
        else{
            System.out.println("all three are differnt");
        }
    }
}