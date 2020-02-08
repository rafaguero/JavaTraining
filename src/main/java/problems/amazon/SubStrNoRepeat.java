package problems.amazon;

public class SubStrNoRepeat {
    public static void main(String[] args) {
        System.out.println("the longest substring without repeating characters is " + lengthOfLongestSubstring("bbbbb"));
    }
    public static int lengthOfLongestSubstring(String s){

        String resultString = "";
        for (int i=0; i<s.length();i++){
            if ( !resultString.contains(s.substring(i,i+1))){
                    System.out.println(s.substring(i,i+1));
                    resultString = resultString + s.substring(i,i+1);
                    System.out.println(resultString);
            }
        }
        return resultString.length();
    }
}
