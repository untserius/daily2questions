package array.easy;

public class Largest_Element {
    public static void main(String[] args) {
        int[] arr = {-199,0,-13,-44,-5};
        Largest_Element largestElement = new Largest_Element();
        System.out.println(largestElement.findTheLargestElement(arr));
    }

    public int findTheLargestElement(int[] arr) {

        int max = -1000000000;

        for (int i = 0; i <= arr.length-1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}
