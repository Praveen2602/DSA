import java.util.Scanner;

public class PairSum {
     static int pairSum(int arr[], int n){
        int ans = 0;
        for(int i =0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
            if(arr[i]+arr[j] == n ){
                ans++;
            }
        }
    }
    return ans;
}
public static void main(String[] args) {
    Scanner s =new Scanner(System.in); 
        int arr[] = new int[10];
        System.out.println("Enter the 10 elements");
        for(int i = 0;i<arr.length;i++){
        arr[i] = s.nextInt();
        }
        int res = pairSum(arr,6);
        System.out.println("the total pairs is :");
        System.out.println(res);
}
}
