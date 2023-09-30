// . Write a Java program with a method that accepts an array of integers and returns the sum
// of all the even numbers in the array. Call this method with a sample array.

import java.util.Scanner;

class ass19{
    static int even(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                sum=sum+arr[i];
            }
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=sc.nextInt();
        System.out.println("Enter array element ");
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
             arr[i] =sc.nextInt();
        }
        
        System.out.println("Sum of array element "+even(arr));
    }
}
