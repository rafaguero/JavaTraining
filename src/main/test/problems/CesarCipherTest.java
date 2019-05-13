package problems;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CesarCipherTest {

    @Test
    public void testCipher(){
        CesarCipher cesarCipher = new CesarCipher();
        String result = cesarCipher.decode("xvm");
        System.out.println(result);
    }

    @Test
    public void testEncode(){
        CesarCipher cesarCipher = new CesarCipher();
        String result = cesarCipher.encode("java");
        System.out.println(result);
    }

}