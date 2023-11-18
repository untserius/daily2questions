public class recursionPrintNTimes2 {
    static void print(int i, int n){
        if(i > n) return; // base condition
        System.out.println("Serius");

        print(i+1,n);
    }

    public static void main(String[] args) {
        int n = 10;
        print(1, n);
    }
}
