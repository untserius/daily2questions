public class testClass {
    public static void main(String[] args) {
        int n = 54321;
//        int reversedNumber = ;
        System.out.println(revNum(n));
    }

    public static int revNum(int n) {
        int reverse = 0;
        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }
        return reverse;
    }
}
