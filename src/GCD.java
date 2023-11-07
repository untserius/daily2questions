public class GCD {
    public static void main(String[] args){
        int a = 12;
        int b = 8;
        int ans = 1;

        for(int i = 1; i <= Math.min(a,b); i++){
            if(a % i == 0 && b % i == 0){
                ans = i;
            }
        }
        System.out.println("GCD of " + a + " and " + b + " is " + ans);
    }
}
