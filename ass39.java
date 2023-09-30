//Write a Java program to find the largest and smallest numbers in an array of integers.


public class ass39 {
    static int largest(int arr[],int size){
        int larg=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>larg){
                larg=arr[i];
            }
        }
        return larg;
    }
    static int smallest(int arr[],int size){
        int small=arr[0];
        for(int i=0;i<size;i++){
            if(arr[i]<small){
                small=arr[i];
            }
        }
        return small;
    }
    public static void main(String[] args){
        int arr[]={10,9,7,12,6};
        System.out.println("Smallest number in array "+smallest(arr,5));
        System.out.println("Enter largest number in array "+largest(arr,5));
    }
}
