package problems;

import org.junit.Test;


public class ReverseStringTest {

    @Test
    public void reverseString(){

        ReverseString reverseString = new ReverseString();
        String reversed = reverseString.reverseStr("This is a test");
        System.out.println("The input String is " + "This is a test");
        System.out.println("The reversed String is " + reversed);

    }


}