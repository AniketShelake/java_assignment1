//Develop a Java program with a method that accepts a string and returns the reverse of that string. Call this method to reverse a user-input string.

import java.util.Scanner;

public class ass2 {
    static void reverse(String str){
        for(int i=str.length()-1 ;i>=0;i--){
            System.out.print(str.charAt(i));
        }
         
    }
    public static void main(String[] args){
        System.out.println("Enter any String");
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("String in reverse order");
        reverse(str);
    }
}
