package array.easy;


/**
 * Here we are just checking if the previous element is smaller than the current element then, its obviously sorted. (if it's ascending order)
 * **/

public class Check_Sorted_Array_OA {
    public static void main(String[] args) {
        int[] arr = {1,2,773,45,66};
        System.out.println(isSorted(arr));
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i-1]) {
                return false;
            }
        }

        return true;
    }
}
