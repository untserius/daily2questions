public class removeDuplicatesFromSortedArray {



    static int removeDuplicates(int[] ar) {

        int rd = 0;

        for (int i = 1; i < ar.length; i++) {
           if (ar[rd] != ar[i]) {
               rd++;
               ar[rd] = ar[i];
           }
        }
        return rd + 1;
    }


    public static void main(String[] args) {
        /*LC easy - Q.26 (21.06.23)*/

        /*
        INPUT >
        Let int[] nums = {0, 1, 1, 2, 2};
        OUTPUT >
        int k = 2,
        int[] expectedNums = {0, 1, 2, _, _};
         */

        int[] ar = {2, 2, 3, 3, 4, 6, 6};

        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }

        int rd = removeDuplicates(ar);
        System.out.println();

        for (int i = 0; i < rd; i++) {
            System.out.print(ar[i] + "");
        }
    }
}
