package problems;


public class ReverseString {


    public String reverseStr(String n) {
        char[] inputString = n.toCharArray();
        System.out.println("the length of the n is " + n.length());
        char[] outputString = new char[n.length()];
        int length = n.length();
        int counter = 0;
        for (int i = length-1; i >=0; i--) {
            outputString[counter] = inputString[i];
            counter++;
        }
        return String.valueOf(outputString);
    }
    public String reverseTwo(String word){
        StringBuffer newWord = new StringBuffer(word);
        newWord.reverse();
        return newWord.toString();
    }
}
