// Write a Java program to find the k smallest elements in a given array. 
// Elements in the array can be in any order.

class ass28{
    
    public static void main(String[] args){
       
        int arr[]={20,34,-12,38,10};
        int greatest=arr[0];
        for(int i=0;i<arr.length;i++){
            
            if(greatest<arr[i]){
                greatest=arr[i];
              }
        }
        System.out.println("Greatest number is "+greatest);
         
    }
}
