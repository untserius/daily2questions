package Array_Easy;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 5, 6, 4, 67};
        int n = arr.length;

        System.out.println(findSecondLargest(arr, n));
    }

    public static int findSecondLargest(int[] arr, int n){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i <= n-1; i++) {
            if (arr[i] > secondLargest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
