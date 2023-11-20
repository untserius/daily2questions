public class factorialNum {

    static int factorial(int n){
        if(n == 0) { // base condition
            return 1;
        }
        return n * factorial(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }
}
