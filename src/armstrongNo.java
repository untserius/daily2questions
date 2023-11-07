public class armstrongNo {
    static int noOfDigits(int n){
        int count = 0;
        while(n != 0){
            count++;
            n = n/10;
        }
        return count;
    }

    static int checkArmstrong(int n){
        int sum = 0;
        int nod = noOfDigits(n);
        for(int i = 1; i<= nod; i++){
            int digit = n % 10;
            sum = sum + (int)Math.pow(digit, nod);
            n = n/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 153;
        if (n == checkArmstrong(n)) {
            System.out.println(n + " is an Armstrong Number");
        }
        else {
            System.out.println(n + " is not an Armstrong Number");
        }
    }
}
