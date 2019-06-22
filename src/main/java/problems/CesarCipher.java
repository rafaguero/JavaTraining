package problems;

public class CesarCipher {


    public static void main(String[] args) {
        CesarCipher cesarCipher = new CesarCipher();
        String result = cesarCipher.decode("xvm");
        System.out.println(result);

        CesarCipher cesarCipher2 = new CesarCipher();
        String result2 = cesarCipher2.encode("java");
        System.out.println(result2);
    }

    public String decode(String code) {

        String decoded = "";
        int lastCharValue = 'z';
        int alphabetLength = 'z' - 'a' + 1;
        for (char character: code.toCharArray()) {
            int charNoRotation = character + 5;
            int charValue = charNoRotation < lastCharValue ? charNoRotation : charNoRotation - alphabetLength;
            decoded += (char) charValue;
        }
        return decoded;

    }

    public String encode(String encode){
        String encoded = "";
        int lastCharValue = 'a';
        int alphaLength = 'z' - 'a' + 1;
        for (char character: encode.toCharArray()){
            int charNoRotation = character - 5;
            int charValue = charNoRotation < lastCharValue ? charNoRotation + alphaLength : charNoRotation;
            encoded += (char) charValue;
        }
        return encoded;
    }

}