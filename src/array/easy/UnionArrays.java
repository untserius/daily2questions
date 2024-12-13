package array.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class UnionArrays {
    // Union means all distinct and common elements in both arrays.
    // Using Set

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7};
        int[] arr2 = {6,7,8,8,9,10,11};
        System.out.println(Arrays.toString(unionOfArrays(arr1, arr2)));
    }

    private static int[] unionOfArrays(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }

        int[] ans = new int[set.size()];
        Integer[] array = set.toArray(new Integer[0]);

        for (int i = 0; i < array.length; i++) {
            ans[i] = array[i];
        }

        return ans;
    }
}
