public class checkPalindromeRecursive {
    public static void main(String[] args) {
        String str = "madam";
        System.out.println(isPalindrome(0, str));
    }

    static boolean isPalindrome(int i, String str){

        if(i >= str.length() / 2) return true; // base condition

        int start = str.charAt(i);
        int end = str.charAt(str.length() - 1 - i);
        if(start != end) return false;

        return isPalindrome(i+1, str);
    }
}
