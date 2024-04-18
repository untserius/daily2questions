package Array_Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 4, 5};

        System.out.println(Arrays.toString(removeDuplicates(arr)));
    }

    public static int[] removeDuplicates(int[] arr){
        HashSet<Integer> temp = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            temp.add(arr[i]);
        }

        ArrayList<Integer> temp2 = new ArrayList<>(temp);

        int k = temp.size();
//        int index = 0;
//        for (int x : temp){
//            arr[index++] = x;
//        }

        int[] newArray = new int[k];
        for (int i = 0; i < k; i++){
            newArray[i] = temp2.get(i);
        }
        return newArray;
    }
}
