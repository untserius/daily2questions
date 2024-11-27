package array.easy;

import java.util.Arrays;

public class Left_Rotate_Array_FT {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(rotateArray(arr)));

        // for rotating by 1 place, take the 0th element put it in last index and overwite the other indexes by -1.
    }

    public static int[] rotateArray(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length - 1] = temp;
        return arr;
    }
}
