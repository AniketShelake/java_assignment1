import java.util.Scanner;

class Shape{
    static float triangle(int height, int base){
        float t_area= 1/2*(height*base);
        return t_area;
    }
    static int rectangle(int length, int width){
        int r_area= length*width;
        return r_area;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Choose one which area you want");
        int i=sc.nextInt();
        if(i==1){
            System.out.println("Area of rectangle");
            System.out.println("Enter lenght and width");
            int length=sc.nextInt();
            int width=sc.nextInt();
            
            System.out.println(rectangle(length,width));
        }
        if(i==2){
            System.out.println("Area of triangle");
            System.out.println("Enter base and heigth");
            int base=sc.nextInt();
            int height=sc.nextInt();
            
            System.out.println(triangle(height,base));
        }
    }
}