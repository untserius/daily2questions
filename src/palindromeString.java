public class palindromeString {
    public static void main(String[] args) {
        String str = "addaa";
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str){
        if(str == null || str.length() == 0) {
            return true;
        }
        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);
        }
        return true;
    }
}
