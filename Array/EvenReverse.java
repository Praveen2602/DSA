import java.util.Scanner;

public class EvenReverse {
    static void printArray(int a[]){
        int n=a.length;
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
    
    
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements in array");
        for(int i=0;i<arr.length;i++){
        arr[i] = sc.nextInt();
        }
        printArray(arr);
        
       }
    }
    
