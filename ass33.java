//Create a Java program that finds the prime numbers within a given range.


public class ass33 {
    static boolean prime(int num){
         boolean isprime=true;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                isprime=false;
            }
        }
        return isprime;
    }
    public static void main(String[] args){
        
        for(int i=2;i<20;i++){
            if(prime(i)){
                System.out.println(i);
            }
        }
    }
}
