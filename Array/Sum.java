import java.util.Scanner;

public class Sum {
    int arraySum(){
        Scanner sc =new Scanner(System.in); 
        int arr[] = new int[5];
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
public static void main(String[] args) {
    Sum s = new Sum();
    int maxValue = s.arraySum();
    System.out.println("the maximum value is  = ");
    System.out.println(maxValue);
}    
}
