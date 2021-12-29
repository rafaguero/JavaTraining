package problems;

public class VowelRemoval {
    public static void main(String[] args) {
        String myInput = "Ths wbst s fr lsrs L[]L!";
        myInput = myInput.replaceAll("[aeiou]","");

        System.out.println(myInput);
    }
}
