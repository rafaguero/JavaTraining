package problems;


public class Palindrome {

    public boolean isPalindrome(String str){

        StringBuffer word = new StringBuffer(str);
        String reverse = word.reverse().toString();

        if (reverse.equals(str))
            return true;
        else
            return false;

    }


}
