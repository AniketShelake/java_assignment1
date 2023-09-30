//Write a Java program that takes a character as input and checks whether it's a vowel or a consonant.

import java.util.Scanner;

public class ass32 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char str=sc.next().charAt(0);
        if(str=='a'||str=='e'||str=='i'||str=='o'||str=='u'){
             System.out.println("char is vowel");
        }
        else{
            System.out.println("Char is consonant");
        }
    }
}
