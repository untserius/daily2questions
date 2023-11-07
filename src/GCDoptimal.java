public class GCDoptimal {
    // gcd(a,b) = gcd(b, a % b);
    static int gcd(int a, int b){
        if(b == 0){
            return a;
        } else {
            return gcd(a, a % b);
        }
    }

    public static void main(String[] args) {
        int a = 8;
        int b = 12;

        System.out.println(gcd(a,b));
    }
}
