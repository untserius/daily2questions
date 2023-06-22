import java.util.Arrays;

public class removeDuplicatesFromSortedArray {



    static int[] removeDuplicates(int[] ar) {

        int rd = 0;

        for (int i = 1; i < ar.length; i++) {
           if (ar[rd] != ar[i]) {
               rd++;
               ar[rd] = ar[i];
           }
        }
        int[] nums = new int[rd + 1];
        for (int i = 0; i <= rd; i++) {
            nums[i]=ar[i];
        }
        return nums;
    }


    public static void main(String[] args) {
        /*LC easy - Q.26 (21.06.23)*/

        /*
        INPUT >
        Let int[] nums = {0, 1, 1, 2, 2};
        OUTPUT >
        int k = 2,
        int[] expectedNums = {0, 1, 2, _, _};
         */

        int[] ar = {2, 2, 3, 3, 4, 6, 6};

        int[] nums = removeDuplicates(ar);
        System.out.println(nums.length);
        System.out.print(Arrays.toString(nums));
    }
}
