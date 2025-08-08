package day6;

public class WordMatcher {

    public static String identifyPossibleWords(String input1, String input2) {
        // Split the second input by colon
        String[] words = input2.split(":");
        input1 = input1.trim(); // Remove extra spaces if any
        input1 = input1.toLowerCase(); // For case-insensitive comparison

        StringBuilder result = new StringBuilder();

        for (String word : words) {
            word = word.trim(); // Trim individual words
            if (word.length() != input1.length()) {
                continue; // Skip if length doesn't match
            }

            boolean isMatch = true;

            for (int i = 0; i < input1.length(); i++) {
                char c1 = input1.charAt(i);
                char c2 = Character.toLowerCase(word.charAt(i));

                if (c1 != '_' && c1 != c2) {
                    isMatch = false;
                    break;
                }
            }

            if (isMatch) {
                if (result.length() > 0) {
                    result.append(" ");
                }
                result.append(word.toUpperCase());
            }
        }

        if (result.length() == 0) {
            return "ERROR-009";
        }

        return result.toString();
    }

    // Main method for testing
    public static void main(String[] args) {
        String input1 = "Fi_er";
        String input2 = "Fever:filer:Filter:Fixer:fiber:fibre:tailor:offer";
        String output = identifyPossibleWords(input1, input2);
        System.out.println(output); // Expected: FILER FIXER FIBER
    }
}
