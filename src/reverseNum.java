public class reverseNum {
    static int revNum(int n){
        int revNumber = 0;
        int num = n;

        while(num != 0){
            int digit = num % 10;
            revNumber = revNumber * 10 + digit;
            num = num / 10;
        }
        return revNumber;
    }

    public static void main(String[] args) {
        int n = 12345;
        System.out.println(revNum(n));
    }
}
