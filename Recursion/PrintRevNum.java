package Recursion;
import java.util.*;
public class PrintRevNum{
    public static void printNumber(int n){
     if(n==1){
        System.out.print(1+" ");
        return;
     }
     System.out.print(n+" ");
     printNumber(n-1);
    //  System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNumber(n);
    }
}

