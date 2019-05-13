package problems;

public class CesarCipher {

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