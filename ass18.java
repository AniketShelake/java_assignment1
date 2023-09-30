//Create a Java program that defines a method to calculate the area of a circle and another
//method to calculate the volume of a sphere. Allow the user to choose which calculation to
//perform.

import java.util.Scanner;

public class ass18 {
    //int radius;
    static double a_circle(int radius){
        double area=3.14*radius*radius;
        return area;
    }
    static double v_sphere(int radius){
        double volume=(4*radius*radius*radius*3.14)/3;
        return volume;
    }
    public static void main(String[] args){
        boolean flag=true;
        do{
        System.out.println("Enter 1: to print area of circle Enter 2: to print volume of sphere Enter 3: to exit");
        Scanner sc=new Scanner(System.in);
        int option=sc.nextInt();
        
        
        switch(option){
            case 1:
                  System.out.println("Enter radius to print area of circle");
                  int radius=sc.nextInt();
                  System.out.println(a_circle(radius));
                  break;
            
            case 2:  
                   System.out.println("Enter radius to volume of sphere");
                   int radi=sc.nextInt();
                   System.out.println(v_sphere(radi));   
                   break;    
            case 3:
                    flag=false;
        }
    }while(flag);

    }
}
