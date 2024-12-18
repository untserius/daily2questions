package array.easy;

import java.util.Arrays;

public class Right_Rotate_Array_By_K {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8};
        int k = 3;
        int n = nums.length;

        reverseArray(nums, 0, n-1);
        reverseArray(nums, 0, k-1);
        reverseArray(nums, k, n-1);

        System.out.println(Arrays.toString(nums));

    }

    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
