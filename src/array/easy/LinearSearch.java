package array.easy;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 5;
        System.out.println(linearSearch(arr, target));
    }

    private static int linearSearch(int[] arr, int target) {

        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                ans = i;
            }
        }
        return ans;
    }
}
