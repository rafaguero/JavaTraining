package problems;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneString {

    private static Map<String, String> phoneLettersMap = new HashMap<>();


    private static boolean findWord(String word, String phoneNumber) {


        int letterCounter = 0;
        boolean letterFound = false;
        while (letterCounter < word.length()) {
            for (Character number : phoneNumber.toCharArray()) {
                if (phoneLettersMap.get(number+"").contains(word.charAt(letterCounter) + "")) {
                    letterFound = true;
                    break;
                }
            }
            if (!letterFound){
                return false;
            }
            letterCounter++;
            letterFound = false;
        }
        return true;
    }

    public static void main(String[] args) {
        phoneLettersMap.put("2", "abc");
        phoneLettersMap.put("3", "def");
        phoneLettersMap.put("4", "ghi");
        phoneLettersMap.put("5", "jkl");
        phoneLettersMap.put("6", "mno");
        phoneLettersMap.put("7", "pqrs");
        phoneLettersMap.put("8", "tuv");
        phoneLettersMap.put("9", "wxyz");
        System.out.println("word found ? fix " + findWord("fix","3662277"));
    }
}
