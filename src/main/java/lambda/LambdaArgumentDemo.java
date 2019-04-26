package lambda;

public class LambdaArgumentDemo {

    interface StringFunc {
        String func(String str);
    }

    static String changeStr(StringFunc sf, String s){
        return sf.func(s);
    }
    public static void main(String[] args){
        String inStr = "Lambda Expressions Expand Java";
        String outStr;
        System.out.println("Here is input string: " + inStr);
        StringFunc reverse = (str) -> {
            String result = "";
            for (int i = str.length()-1; i > 0; i--){
                result += str.charAt(i);
            }
            return result;
        };
        outStr = changeStr(reverse,inStr);
        System.out.println("The string reversed is " + outStr);
    }
}
