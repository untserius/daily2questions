public class checkPrime {
    public static void main(String[] args) {
        int n = 3;
        boolean ans = (isPrime(n));
        if (n != 1 && ans == true) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Non Prime Number");
        }
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < Math.sqrt(n); i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
