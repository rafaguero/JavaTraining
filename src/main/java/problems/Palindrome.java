package problems;


public class Palindrome {

    public static boolean isPalindrome(String str){

        StringBuffer word = new StringBuffer(str);
        String reverse = word.reverse().toString();

        if (reverse.equals(str))
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        System.out.println("is palindrome " + isPalindrome("hello"));
    }
}
