//Write a Java program to reverse a given number. For example, if the input is 12345, the output should be 54321.

public class ass36 {
    public static void main(String[] args){
        int input=12345;
        int rem=0;
        int num=0;
        while(input>0){
        
            rem=input%10;
            num=num*10+rem;
            input=input/10;
            
        }
        System.out.println("Reverse of number is "+num);
        
    }
}
