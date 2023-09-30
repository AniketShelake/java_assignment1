// . Write a program in Java to display the cube of the number upto given integer.

import java.util.Scanner;

class ass22{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number upto which you want cube");
        int num=sc.nextInt();
        int cube=0;
        for(int i=1;i<=num;i++){
            cube=i*i*i;
            System.out.println("Cube of "+i+" is "+cube);
        }
    }
}