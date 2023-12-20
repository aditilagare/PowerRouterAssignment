package PowerRouterAssignment;


public class PermutationsOfString {

    public static void main(String[] args) {
        String input = "CAT";
        System.out.println("Input: " + input);
        System.out.println("Output:");
        printPermutations(input.toCharArray(), 0);
    }

    private static void printPermutations(char[] chars, int currentIndex) {
    	// If currentIndex is at the last position, print the permutation
        if (currentIndex == chars.length - 1) {
            System.out.println(new String(chars));
        } else {
            // permutations for the remaining characters
            for (int i = currentIndex; i < chars.length; i++) {
                // Swap the current character with each character after it
                swap(chars, currentIndex, i);

                // Recursively generate permutations for the remaining characters
                printPermutations(chars, currentIndex + 1);

                // Backtrack by swapping back to the original order
                swap(chars, currentIndex, i);
            }
        }
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
