//import java.util.Scanner;

public class printDivisors {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int n = 100;
        printDivisors(n);
    }

    static int printDivisors(int n){
        //brute force O(n)
//        for(int i = 1; i <= n; i++){
//            if(n%i == 0){
//                System.out.print(i + " ");
//            }
//        }

        // optimal O(sqrt(n))
        for(int i = 1; i <= (int)Math.sqrt(n); i++){
            if(n%i == 0){
                System.out.print(i + " ");
                if(i != n/i){
                    System.out.print(n/i + " ");
                }
            }
        }
        return n;
    }
}
