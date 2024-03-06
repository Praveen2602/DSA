import java.util.Scanner;

public class RotateArray {
    static void swapArray(int arr[],int i,int j){
        int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp; 
       }
       static void printReverse(int arr[]){
           int i=0,j=arr.length-1;
           while(i<j){
               swapArray(arr,i,j);
               i++;
               j--;
           }
       }
       static void rotateInPlace(int arr[],int i,int j){
        
       }
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements in array");
        for(int i=0;i<arr.length;i++){
        arr[i] = sc.nextInt();
        }
       }
}
