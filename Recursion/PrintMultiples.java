package Recursion;
import java.util.*;
public class PrintMultiples{
    static void  printMultiple(int n,int k){
        if(k==1){
            System.out.print(n+" ");
            return;
        }
        printMultiple(n, k-1);
        System.out.print(n*k+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println("Enter the value of k");
        int k = sc.nextInt();
       printMultiple(num,k);
    }
}