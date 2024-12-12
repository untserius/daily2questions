package array.easy;

import java.util.Arrays;

public class Left_Rotate_Array_By_D {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int lengthOfArr = arr.length;
        int rotationTime = 3;

        System.out.println(Arrays.toString(leftRotator(arr, lengthOfArr, rotationTime)));
    }

    public static int[] leftRotator(int[] arr, int lengthOfArr, int rotationTime) {

        // modulo because to reduce the rotation when rotation time > size of the array.
        rotationTime = rotationTime % lengthOfArr;

        // copy the elements upto kth to a new array.
        int[] temp = new int[rotationTime];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[i];
        }

        //Shifting the remaining numbers to forward
        for (int i = rotationTime; i < lengthOfArr; i++) {
            arr[i - rotationTime] = arr[i];
        }

        //put back the temporary elements
//        int j = 0;
//        for (int i = lengthOfArr - rotationTime; i < lengthOfArr; i++) {
//            arr[i] = temp[j];
//            j++;
//        }

        // more mathematically
        for (int i = lengthOfArr - rotationTime; i < lengthOfArr; i++) {
            arr[i] = temp[i-(lengthOfArr-rotationTime)];
        }

        return arr;
    }
}
