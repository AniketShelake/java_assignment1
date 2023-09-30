// Write a program in Java to make such a pattern like right angle triangle with number
// increased by 1.The pattern like :
public class ass23 {
    public static void main(String[] args){
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
