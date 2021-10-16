package problems.recursion;

public class ReverseString {

    private static String reverseString(String inputString){

        if (inputString.equals("")){
            return "";
        }
        return  reverseString(inputString.substring(1)) + inputString.charAt(0);
    }

    public static void main(String[] args) {
        String result = reverseString("hello");
        System.out.println(result);
    }
}
