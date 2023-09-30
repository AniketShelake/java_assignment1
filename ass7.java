//Write a Java program that converts a floating-point number to an integer using type casting, 
//and vice versa. Handle potential loss of data.
class ass7{
    public static void main(String[] args){
        int a=10;
        float b=12.34f;
         a=(int)b;
         System.out.println(a);
         b=a;
         System.out.println(b);

    }
}