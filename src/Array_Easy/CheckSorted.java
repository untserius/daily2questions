package Array_Easy;

public class CheckSorted {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};

        System.out.println(checkSorted(arr));
    }

    public static boolean checkSorted(int[] arr){
        for (int i = 0; i <= arr.length - 2; i++){
            if (arr[i + 1] < arr[i]){
                return false;
            }
        }
        return true;
    }
}
