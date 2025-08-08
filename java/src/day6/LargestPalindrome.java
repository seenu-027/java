package day6;

import java.util.*;

public class LargestPalindrome {

    public static int minRemovalsToFormPalindrome(String input1) {
        if (input1 == null || input1.isEmpty()) return -1;

        // Convert to lowercase for case-insensitive processing
        input1 = input1.toLowerCase();

        // Step 1: Count frequency of each character
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char ch : input1.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        int oddCount = 0;

        // Step 2: Count characters that have odd frequencies
        for (int count : freqMap.values()) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }

        // Step 3: Apply logic
        if (oddCount == 0) {
            return 0;
        } else if (oddCount == input1.length()) {
            return -1;
        } else {
            return oddCount - 1;
        }
    }
    // Main method to test
    public static void main(String[] args) {
        System.out.println(minRemovalsToFormPalindrome("Template"));   // Output: 3
        System.out.println(minRemovalsToFormPalindrome("Magma"));      // Output: 0
        System.out.println(minRemovalsToFormPalindrome("Victory"));    // Output: -1
        System.out.println(minRemovalsToFormPalindrome("Malayalam"));  // Output: 0
    }
}
