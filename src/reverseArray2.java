import java.util.Arrays;
public class reverseArray2 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        reverse(arr, 0, arr.length-1);
        print(arr);
    }

    static void reverse(int[] arr, int start, int end){
        if(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverse(arr, start+1, end-1);
        }
    }

    static void print(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
}
