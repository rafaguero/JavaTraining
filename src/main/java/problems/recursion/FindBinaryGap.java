package problems.recursion;

public class FindBinaryGap {

        public int solution(int N) {
            String result="";
            String binaryString = decimalToBinary(N,result);
            System.out.println(binaryString);
            String[] resultStrings = binaryString.split("1");
            int largestGap = 0;
            for (int i=0;i<resultStrings.length;i++)
            {
                if (resultStrings[i].contains("0") && i< resultStrings.length ){
                    if (resultStrings[i].length() > largestGap) {
                        if (i + 1 == resultStrings.length) {
                            if (binaryString.endsWith("1")) {
                                largestGap = resultStrings[i].length();
                            }
                        }else {
                            largestGap = resultStrings[i].length();
                        }
                    }
                }
            }
            return largestGap;
        }
        public String decimalToBinary(int number,String result){
            if (number == 0 ){
                return result;
            }
            result = number%2 + result;
            return decimalToBinary(number/2,result);
        }

    public static void main(String[] args) {
        FindBinaryGap findBinaryGap = new FindBinaryGap();
        System.out.println(findBinaryGap.solution(1041));
    }
}
