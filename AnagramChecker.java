package PowerRouterAssignment;

import java.util.Arrays;

public class AnagramChecker {

    public static void main(String[] args) {
        String str1 = "Welcome";
        String str2 = "ceelmow";

        System.out.println("Input String 1: " + str1);
        System.out.println("Input String 2: " + str2);

        if (areAnagrams(str1, str2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }

    private static boolean areAnagrams(String str1, String str2) {
        // convert to lowercase for case-insensitive comparison
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        // Check if the sorted characters of both strings are equal
        return Arrays.equals(charArray1, charArray2);
    }
}
