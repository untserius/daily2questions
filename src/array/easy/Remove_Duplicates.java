package array.easy;

public class Remove_Duplicates {
    public static void main(String[] args) {
        int[] arr = {1,3,4,4,5,5,8,9};
        int uniqueNumsLimit = uniqueNums(arr);
        for (int i = 0; i< uniqueNumsLimit; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int uniqueNums(int[] arr) {
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i-1]) {
                j++;
                arr[j] = arr[i];
            }
        }
        return j + 1;
    }
}
