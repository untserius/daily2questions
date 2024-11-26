package array.easy;

/**
 * Here we are running two traversal one from start and one from start + 1, checking if the start element is smaller than the start+1 element then, its obviously sorted. (if it's ascending order)
 * **/

public class Check_Sorted_Array_BF {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,2};
        System.out.println(check(arr));
    }

    public static boolean check(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    return false;
                }
            }
        }

        return true;
    }
}
