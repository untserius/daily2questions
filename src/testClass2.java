public class testClass2 {
    public static void main(String[] args) {
        int x = 98765;
        System.out.println(revNum(x));
    }
    
    public static int revNum(int x) {
        int reverse = 0;
        while (x != 0){
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x = x / 10;
        }
        return reverse;
    }
}
