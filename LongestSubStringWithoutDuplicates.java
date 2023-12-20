package PowerRouterAssignment;

public class LongestSubStringWithoutDuplicates {

    public static void main(String[] args) {
        String str = "Welcome to PowerRouter";
        String[] words = str.split(" ");

        String longestSubstring = "";

        for (String word : words) {
            String currentSubstring = findLongestSubstringWithoutDuplicates(word);
            if (currentSubstring.length() > longestSubstring.length()) {
                longestSubstring = currentSubstring;
            }
        }

        System.out.println("Longest Substring Without Duplicates: " + longestSubstring);
    }

    private static String findLongestSubstringWithoutDuplicates(String s) {
        String longestSubstring = "";
        String currentSubstring = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!currentSubstring.contains(String.valueOf(c))) {
                currentSubstring += c;
            } else {
                if (currentSubstring.length() > longestSubstring.length()) {
                    longestSubstring = currentSubstring;
                }
                currentSubstring = "" + c;
            }
        }

        // Check if the last substring is longer
        if (currentSubstring.length() > longestSubstring.length()) {
            longestSubstring = currentSubstring;
        }

        return longestSubstring;
    }
}
