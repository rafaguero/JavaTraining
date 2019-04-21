package problems;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UpperCaseTest {

    @Test
    public void convertToUpper(){
        UpperCase upperCase = new UpperCase();
        List<String> list = Arrays.asList("hello","San Luis","Yuma");
        System.out.println(upperCase.convertToUpper(list));
    }
}