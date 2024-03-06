// import java.util.Scanner;

// public class CountElem{
//     static int lastOccur(int arr[] , int a){
//         int lastIdx = Integer.MIN_VALUE;
//         for(int i =0;i<arr.length;i++){
//             if(arr[i]==a){
//                 lastIdx = i;
//             }
            
//         }
//         return lastIdx;
//     }
//     static int printCount(int arr[] , int a){
//         int count=0;
//         for(int i =0;i<arr.length;i++){
//             if(a==arr[i]){
//                 count++;
//             }
//         }
//         return count;
//     } 
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = 5;
//         int arr[] = new int[n];
//         for(int i = 0;i<arr.length;i++){
//             arr[i] = sc.nextInt();
//         }
//         int res = printCount(arr,3);
//         System.out.println("the count is = ");
//         System.out.println(res);
//         System.out.println("the last index is = ");
//         System.out.println(lastOccur(arr, 3));
//     }
// }
import java.io.*;
import java.util.*;
public class CountElem
{
public static boolean check(int a[]) {
boolean ans = true;
for(int i = 1; i < a.length; i++) {
if(a[i] < a[i-1])
ans = false;
}
return ans;
}
public static void main(String[] args) {
int a[] = { 1, 2, 3, 4 , 5};
System.out.println(check(a));
}
}