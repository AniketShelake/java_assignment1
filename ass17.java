//Write a Java program that takes a user-input string and counts the number of vowels (a, e,
//i, o, u) in it

import java.util.Scanner;

public class ass17 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any string");
        String str=sc.nextLine();
        int count =0;
        //char arr[]=(char)str;
        char[] ch = new char[str.length()];
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println("Number of vowels "+count);
    }
}
