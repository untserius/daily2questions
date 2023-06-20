import java.util.Arrays;

public class twosum {
    public static void main(String[] args) {
        /* Let nums = [1, 2, 3, 4]
               target = 6

               Output = [1, 3]
               (because nums[1] + nums[3] = 6
         */
        int[] arr = {3, 2, 4, 6};
        System.out.println(Arrays.toString(ans(arr, 6)));
    }

    static int[] ans(int[] arr, int target) {

        for (int i=0; i<arr.length; i++) {
            for (int j=i+1; j<arr.length; j++) {
                int sum = arr[i] + arr[j];
                if (sum == target) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }
}
