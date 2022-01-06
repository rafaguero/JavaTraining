package problems.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonCharacters {
    public static List<String> commonChars(String[] words) {
        //Input: words = ["bella","label","roller"]
        //Output: ["e","l","l"]
        int numberOfWords = words.length;
        Map<String,Integer> wordMap = new HashMap<>();
        String firstWord = words[0];
        int counter = 0;
        int numberFound = 0;
        while (counter < firstWord.length()){
            for (int i = 1; i< numberOfWords; i++){
                if (words[i].contains(String.valueOf(firstWord.charAt(counter)))){
                    numberFound++;
                    words[i] = words[i].replaceFirst(String.valueOf(firstWord.charAt(counter)),"");
                }
            }
            if (numberFound >= numberOfWords-1){
                if (wordMap.getOrDefault(String.valueOf(firstWord.charAt(counter)),0) > 0){
                    wordMap.put(String.valueOf(firstWord.charAt(counter)),wordMap.get(String.valueOf(firstWord.charAt(counter)))+numberFound);
                } else {
                    wordMap.put(String.valueOf(firstWord.charAt(counter)), numberFound);
                }
            }
            numberFound = 0;
            counter++;
        }

        List<String> result = new ArrayList<>();
        wordMap.forEach((stringChar,cntr) -> {

            while (cntr >= numberOfWords-1){
                    result.add(stringChar);
                    cntr = cntr - (numberOfWords-1);
                }
        });
        return result;
    }

    public static void main(String[] args) {
        //"bella","label","roller"
        String[] words = new String[]{"bella","label","roller"};
        List<String> common = commonChars(words);
        System.out.println(common);
    }
}
