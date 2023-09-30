//Develop a Java program that calculates the sum of the digits of a given integer
public class ass45 {
    public static void main(String[] args){
        int digit=12345;
        int sum=0;
        while(digit>0){
            int d=digit%10;
            sum=sum+d;
            digit=digit/10;
        }
        System.out.println("Sum of digit "+sum);
    }
}
