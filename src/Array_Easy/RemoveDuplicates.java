package Array_Easy;

import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 4, 5};

        int size = getSize(arr);

        for (int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static int getSize(int[] arr){
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        int size = set.size();
        int index = 0;
        for (int e : set){
            arr[index++] = e;
        }
        return size;
    }
}
