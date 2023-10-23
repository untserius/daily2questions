public class countDigits {
    public static void main(String[] args) {
        int n = 0;

        System.out.println(noOfDigits(n));
    }

    static int noOfDigits(int n){
        int x = n;
        int count = 0;

        if (x != 0) {
            while (x != 0) {
                x = x / 10;
                count++;
            }
            return count;
        }
        return 1;
    }
}
