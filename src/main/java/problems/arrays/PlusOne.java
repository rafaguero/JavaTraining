package problems.arrays;

import com.sun.xml.internal.ws.api.model.wsdl.editable.EditableWSDLInput;

import java.util.Arrays;

public class PlusOne {
    //1 <= digits.length <= 100
    //0 <= digits[i] <= 9
    //digits does not contain any leading 0's.
    //Input: digits = [1,2,3]
    //Output: [1,2,4]
    //Explanation: The array represents the integer 123.
    //Incrementing by one gives 123 + 1 = 124.
    //Thus, the result should be [1,2,4].
    public static int[] plusOne(int[] digits) {
        if (digits[digits.length-1] < 9){
            digits[digits.length-1] = digits[digits.length-1] + 1;
            return digits;
        }
        boolean allNines = true;
        if (digits[0] == 9){
            for (int i = 1; i< digits.length;i++){
                if (digits[i] != 9){
                    allNines = false;
                    break;
                 }
            }
            if (allNines){
                int[] result = new int[digits.length + 1];
                result[0] = 1;
                return result;
            }
        }
        int carry = 0;
        //989
        for (int i = digits.length-1; i>=0 ;i--){
            if ( digits[i] + 1 > 9){
                carry = 1;
                digits[i] = digits[i] = 0;
            }else {
                digits[i] = digits[i] + carry;
                break;
            }

        }
        return digits;
    }

    public static void main(String[] args) {
        int[] number = new int[]{9,8,7};
        System.out.println(Arrays.toString(plusOne(number)));
    }
}
