package Recursion;

public class Fibonacci {
static int printFibo(int n){
    //base case 
    if(n==0 || n==1){
        return n;
    }
    return printFibo(n-1)+printFibo(n-2);
}
public static void main(String[] args) {
    System.out.println(printFibo(2));
}    
}
