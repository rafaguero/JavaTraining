package problems.arrays;

import java.util.Arrays;

public class Annagram {
    public static boolean isAnnagram(String str1, String str2){
        if (str1.length() != str2.length()){
            return false;
        }
        char[] arr1 = str1.toLowerCase().toCharArray();
        char[] arr2 = str2.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (Arrays.equals(arr1,arr2)) {
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("is anagram " + isAnnagram("listen","silent"));
    }
}
