// Develop a Java program to print the Fibonacci series up to a specified number of terms.

public class ass31 {
    void Fibonacci(int count){
        if(count<1){
            System.out.println("Not valid number");
        }
        int prev1=0;
        int prev2=1;
        //int count=0;
        count=2;
        System.out.println(prev1);
        System.out.println(prev2);

        for(int i=2;i<count;++i){
            if(count>2){
                int num=prev1+prev2;
                
                System.out.println(num);
                prev1=prev2;
                prev2=num;
                count++;
            }
           
        }
        
    }
    public static void main(String[] args){
            ass31 as=new ass31();
            as.Fibonacci(5);
        }
}
