import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] temp = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[arr.length - i - 1];
        }
        System.out.println(Arrays.toString(temp));
    }
}
