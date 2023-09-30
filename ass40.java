//Develop a Java program that checks if a given string is a palindrome (reads the same forwards and backwards).

public class ass40 {
    public static void main(String[] args){
        String str="AninA";
        String str1="";
        for(int i=str.length()-1;i>=0;i--){
            str1=str1+str.charAt(i);
        }
        if(str1.equals(str)){
            System.out.println("String is palindrom");
        }
    }
}
