public class print1toN {

    static void print(int n){
        if(n == 0) return; // base condition
        print(n-1);
        System.out.println(n);
    }

    static void print2(int i, int x){
        if(i < 1) return; // base condition
        print2(i-1,x);
        System.out.println(i);
    }
    public static void main(String[] args) {
        int n = 10;
        int x = 7;
        print(n);
        print2(x, x);
    }
}
