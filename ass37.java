
// Write a Java program that calculates the sum of all even numbers between 1 and 100 using a while loop.

public class ass37 {
    public static void main(String[] args){
        int sum=0;
        for(int i=1;i<=100;i++){
            if(i%2==0){
               sum=sum+i;
            }
        }
        System.out.println("Sum of numbers "+sum);
    }
}
