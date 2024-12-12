package array.easy;

import java.util.Arrays;

public class MoveAllZeroes {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        System.out.println(Arrays.toString(moveZeroes(arr)));
    }

    public static int[] moveZeroes(int[] arr) {

        int nonZeroIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[nonZeroIndex];
                arr[nonZeroIndex] = temp;
                nonZeroIndex++;
            }
        }
        return arr;
    }
}
