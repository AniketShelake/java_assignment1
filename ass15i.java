//Create a Java program with a method that checks if a given string is a palindrome
// (reads the same forwards and backwards). 
//Use this method to validate user input.

import java.util.Scanner;

public class ass15i {
    static boolean palindrome(String str){
        boolean ispalin=false;
        String rev="";
        char ch;
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            rev=ch+rev;

        }
        if(str.equals(rev)){
            ispalin=true;
        }
        
        return ispalin;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String");
        String str=sc.nextLine();
        if(palindrome(str)){
            System.out.println("String is palindrom");
        }
        else{
            System.out.println("String is not palindrom");
        }
    }
}
