import java.util.Scanner;

public class ReverseArray {
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
    static int[] rotateArray(int arr[] ,int k){
        int j=0;
        int n = arr.length;
        k = k%n;
        int ans[] = new int[n];
        for(int i = n-k;i<n;i++){
            ans[j++] = arr[i];

        }
        for(int i=0;i<n-k;i++){
            ans[j++] = arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements in array");
        for(int i=0;i<arr.length;i++){
        arr[i] = sc.nextInt();
        }
        System.out.println("Enetr the value to rotate");
        //printReverse(arr);
        int k = sc.nextInt();
        int ans[] = rotateArray(arr,k);
        System.out.println("the value after rotation");
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
        }
    
}
