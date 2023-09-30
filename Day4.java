public class Day4 {
    int a;
    static int b;
    void display(){
        System.out.println("The value of A "+a);
        System.out.println("The value of B "+b);
    }
     Day4(){

    }
    public static void main(String[] args){
        Day4 d1= new Day4();
        d1.display();
        d1.a=30;
        d1.b=40;
        d1.display();

        Day4 d2= new Day4();
        d2.display();
    }

}
