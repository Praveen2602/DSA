
class PrintArray{
    // static void printArray(int arr[], int idx){
    //     if(idx==arr.length){
    //         return;
    //     }
    //     System.out.print(arr[idx]+" ");
    //     printArray(arr, idx+1);
    // }
    // static int printMaxArray(int arr[],int idx){
    //     if(idx == arr.length-1){
    //         return arr[idx];
    //     } 
    //     int smallAns = printMaxArray(arr, idx+1);
    //     return Math.max(arr[idx], smallAns);
    // }
    static int printSumArray(int arr[], int idx){
        if(idx ==arr.length){
            return 0;
        }
        int sumArray = printSumArray(arr, idx+1);
        return arr[idx]+sumArray;
    }
public static void main(String[] args) {
    int arr[] = {3,2,5,8,6,1};
    //printArray(arr,0);
    System.out.println(printSumArray(arr, 0));
}
}