import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {

        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};

        int m = valueM(nums1);
        int n = nums2.length;

        System.out.println(Arrays.toString(merge(nums1, m, nums2, n)));
        /* nums1 and nums2 = non-decreasing arrays containing m and n integers respectively.
            nums1.length = m + n
            nums2.length = n
         */
    }
    static int valueM(int[] nums1) {
        int m = 0;
        for (int num : nums1) {
            if (num != 0) { // length of nums1 excluding zero elements.
                m++;
            }
        }
        return m;
    }
    static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        // variables as pointers
        int i = m-1; // will point at m-1 index of nums1 array.
        int j = n-1; // will point at n-1 index of nums2 array.
        int k = nums1.length - 1; // will point at the last position of the nums1 array.

        // Now traversing the nums2 array.
        while (j>=0) {
            // if the element at i index of nums1 i.e nums1[i] > nums2[j].
            // then it is the largest among the 2 arrays and will be stored at the k position of the nums1 array.
            // using i>=0 to check whether we have elements to compare in nums1 array.
            if (i>=0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                k--;
                i--;
            } else {
                // elements at nums[j] > nums[i] or there is no element left to compare in nums2 array.
                // now we just have to push the elements of nums2 array in nums1 array.
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }
        return nums1;
    }
}
