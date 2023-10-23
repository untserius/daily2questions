public class palindromeNum {
    static int revNum(int n){
        int num = n;
        int reverse = 0;

        while(num != 0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        int n = 121;

        if (n == revNum(n)) {
            System.out.println(n + " is a Palindromic Number");
        }
        else {
            System.out.println(n + " is not a Palindromic Number");
        }
    }
}
