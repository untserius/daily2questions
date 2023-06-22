import java.util.Arrays;

public class plusOne {
    public static void main(String[] args) {
        int[] digits = {1, 3, 6};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    static int[] plusOne(int[] digits) {
        int n = digits.length;

        for(int i = n-1; i>=0; i--) { //starting from the less significant digit i.e extreme right.
            if (digits[i] < 9) { // in = {5, 6} -> op = {5, 7}
                digits[i]++;
                return digits;
            }
            digits[i] = 0; // if in = {5, 9}, then we hv to make it 0. So, after iterating io its next digit, it becomes {6, 0}. (as 5+1 = 6)
        }
        // for numbers like 9999, it will become {0,0,0,0}.
        // we have to add a digit 1 to the length of this no to make {0, 0, 0, 0, 0}.
        // Then change the [0] digit to 1.
        digits = new int[n + 1];
        digits[0] = 1;
        return digits;
    }
}
