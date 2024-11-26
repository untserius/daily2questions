package array.easy;

public class Second_Largest_Second_Smallest {
    public static void main(String[] args) {
        int[] arr = {1,2,4,7,7,5};
        System.out.println(findTheSecondLargest(arr)); // O(N)
        System.out.println(findTheSecondSmallest(arr)); // 0(N)

        // time_complexity - O(2N)
    }

    public static int findTheSecondLargest(int[] arr) {

        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) { // Check if arr[i] > max
                max2 = max;
                max = arr[i];
            } else if (arr[i] > max2 && arr[i] < max) { // Check again if arr[i] > max2
                max2 = arr[i];
            }
        }
        return max2;
    }

    public static int findTheSecondSmallest(int[] arr) {
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min2 = min;
                min = arr[i];
            } else if (arr[i] < min2 && arr[i] > min) {
                min2 = arr[i];
            }
        }
        return min2;
    }
}
