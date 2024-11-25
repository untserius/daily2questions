package array.easy;

public class Second_Largest_Second_Smallest {
    public static void main(String[] args) {
        int[] arr = {1,2,4,7,7,5};
        System.out.println(findTheSecondLargest(arr));
    }

    public static int findTheSecondLargest(int[] arr) {

        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max2 = max;
                max = arr[i];
            } else if (arr[i] > max2 && arr[i] < max) {
                max2 = arr[i];
            }
        }
        return max2;
    }
}
