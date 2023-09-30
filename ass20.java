//take three numbers from the user and print the greatest number.

import java.util.Scanner;

public class ass20 {
    static int greatest(int a,int b,int c){
        int greatest=0;
        if(a>b&&a>c){
            greatest=a;
        }
        else if(b>a&&b>c){
            greatest=b;
        }
        else{
            greatest=c;
        }
        return greatest;
    }
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     int b=sc.nextInt();
     int c=sc.nextInt();
     System.out.println("Greatest of three "+greatest(a, b, c));
    }
}
