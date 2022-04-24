import java.util.*;

public class PhoneNumberWords {
    //phoneNumber = "3662277"
    //words = ["foo","bar","foobar","emo","cap","car","cat"]
    private static Map<String,String> phoneMap = new HashMap<>();


    public static void main(String[] args) {
        String phoneNumber = "3662277";
        List<String> words = Arrays.asList("foo","bar","foobar","emo","cap","car","cat");
        List<String>result = findMatchingWords(phoneNumber,words);
    }

    private static List<String> findMatchingWords(String phoneNumber, List<String> words) {
        phoneMap.put("1","");
        phoneMap.put("2","abc");
        phoneMap.put("3","def");
        phoneMap.put("4","ghi");
        phoneMap.put("5","jkl");
        phoneMap.put("6","mno");
        phoneMap.put("7","pqrs");
        phoneMap.put("8","tuv");
        phoneMap.put("9","wxyz");
        phoneMap.put("0","");
        String lettersIncluded = "";
        for (Character digit:phoneNumber.toCharArray()){

            if (phoneMap.containsKey(String.valueOf(digit))){
                lettersIncluded = lettersIncluded + phoneMap.get(digit);
            }

        }
        System.out.println("letters included is " + lettersIncluded);

        return null;
    }
}
