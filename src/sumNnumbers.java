public class sumNnumbers {
    public static void main(String[] args) {
        int n = 10;
        int x = 20;
        sumOfNums(n, 0);
        System.out.println(sumOfNums2(x));
    }
    // Parameterized way
    static void sumOfNums(int i, int sum){
        if(i == 0) { // base condition
            System.out.println(sum);
            return;
        }
        sumOfNums(i-1, sum+i);
    }

    // Functional way
    static int sumOfNums2(int n){
        if(n == 0) {
            return 0;
        } // base condition
        return n + sumOfNums2(n-1);
    }
}
