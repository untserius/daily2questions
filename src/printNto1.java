public class printNto1 {

    static void print(int i, int n){
        if(i == 0) return; // base condition
        System.out.println(i);
        print(i-1, n);
    }
    public static void main(String[] args) {
        int n = 10;
        print(n, n);
    }
}
