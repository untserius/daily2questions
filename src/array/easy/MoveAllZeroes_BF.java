package array.easy;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveAllZeroes_BF {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        System.out.println(Arrays.toString(moveZeroes(arr)));
    }

    public static int[] moveZeroes(int[] arr) {

        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                temp.add(arr[i]);
            }
        }

        for (int j = 0; j < temp.size(); j++) {
            arr[j] = temp.get(j);
        }

        for (int x = temp.size(); x < arr.length; x++) {
            arr[x] = 0;
        }

        return arr;
    }
}
