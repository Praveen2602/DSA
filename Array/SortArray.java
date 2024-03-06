public class SortArray {
    //    static void swapArray(int arr[],int i,int j){
    //     int temp = arr[i];
    //     arr[i] = arr[j];
    //     arr[j] = temp;
    //    } 
    //    static  int[] sortArray(int arr[]){
    //     int left=0;
    //     int right = arr.length-1;
    //     while(left<right){
    //         if(arr[left]==1 && arr[right]==0){
    //             swapArray(arr,left,right);
    //             left++;
    //             right--;
    //         }
    //         else if(arr[left]==0){
    //             left++;
    //         }
    //         else{
    //             right--;
    //         }
    //     }
    //     return arr;
    //    }
    static int[] printArray(int []arr){
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
        }
        return arr;
       }
    static int[] sortSquare(int arr[]){
        int n = arr.length;
        int l=0;
        int r=n-1;
        while(l<=r){
            if(Math.abs(arr[l])>Math.abs(arr[l])){
                arr[l] = arr[l] * arr[l];
                l++;
            }
            else{
                arr[r] = arr[r] *arr[r];
            }

        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {-10,-3,-2,1,4,5};
        //int res[] =sortArray(arr);
        int res[] = sortSquare(arr);
        System.out.println("the sorted array is");
        System.out.println(printArray(res));

        

    }
}
