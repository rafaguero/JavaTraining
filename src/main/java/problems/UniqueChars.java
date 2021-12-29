package problems;

public class UniqueChars {

    static final int NO_OF_CHARS = 256;

    /* Print duplicates present in the passed string */
    static int[] countDistinct(String str)
    {
        // Create an array of size 256 and count of
        // every character in it
        int[] count = new int[NO_OF_CHARS];

        /* Count array with frequency of characters */
        int i;
        for (i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ')
                count[(int) str.charAt(i)]++;
        }

        int n = i;


        // Print characters having count more than 0
        for (i = 0; i < n; i++)
            if (count[i] == 1) {
                System.out.println("test");
                System.out.print((char) i);
            }
            return count;
    }

    /* Driver program*/
    public static void main(String args[])
    {
        String str = "Successfully designed";
        countDistinct(str);
    }
}
