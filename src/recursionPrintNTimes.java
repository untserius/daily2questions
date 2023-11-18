public class recursionPrintNTimes {

    static int count = 0;
    static void print(){
        if(count == 5) return; // base condition
        System.out.println(count);

        count++;
        print();
    }
    public static void main(String[] args) {
        print();
    }
}

