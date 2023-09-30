//Create a Java program with a method that checks if a given string is a palindrome (reads the same forwards and backwards).
// Use this method to validate user input.

import java.util.Scanner;

class ass15{
    static boolean palindrome(String str){
        boolean ispalin=false;
        int n=str.length();
        String rev="";
        for(int i=n-1;i>=0;i--){
           rev=rev+rev.charAt(i);
        }
        if(str.equals(rev)){
            ispalin=true;
            return ispalin;
        }
        return ispalin;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter any string");
        String str=sc.nextLine();
       if(palindrome("str")){
        System.out.println("String is palindrom");
       }
       else{
        System.out.println("String is not palindrom");
       }

    }
}