import java.util.Scanner;

public class Accessmodifiers {
    private int a ,b;
    public void Getdata(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two number");
        a=sc.nextInt();
        b=sc.nextInt();
    }
    public void show(){
        System.out.println("The value of  "+a+"The value of b: "+b);
    }
}


class Acces{
    public static void main(String[] args){
        Accessmodifiers a1=new Accessmodifiers();
        System.out.println("GetData called");
        a1.Getdata();
        System.out.println("Showdata");
        a1.show();
        
    }
}
