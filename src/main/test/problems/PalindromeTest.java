package problems;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest {

    @Test
    public void isPalindrome(){
        Palindrome palindrome = new Palindrome();
        System.out.println("the word poso is palindrome? " + palindrome.isPalindrome("poso"));
    }

}