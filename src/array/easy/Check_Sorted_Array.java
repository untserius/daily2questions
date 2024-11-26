package array.easy;

// First thought

public class Check_Sorted_Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        System.out.println(checkSorted(arr));
    }

    public static boolean checkSorted(int[] arr) {

        int counter = 0;
        int negativeCounter = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i + 1]) {
                counter++;
            } else {
                negativeCounter++;
            }
        }

        if (negativeCounter == 0) {
            return true;
        } else {
            return false;
        }
    }
}
