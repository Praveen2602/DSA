public class Palin{
    public static void main(String args[]){
        int arr[] = {1,2,4,1};
        int n = arr.length;
        int flag=0;
        for (int i = 0;i<n/2;i++){
            if(arr[i]!=arr[n-1-i]){
                flag=1;
                System.out.println("not palindrome");
                break;
           }

        }
        if(flag==0){
        System.out.println("it is a palindrome");
    
    }
}
}