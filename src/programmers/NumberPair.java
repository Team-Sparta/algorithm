package src.programmers;

public class NumberPair extends Solution {
    public static void main(String[] args) {

        subTest(1, solution("100", "2345"), "-1");
        subTest(2, solution("100", "203045"), "0");
        subTest(3, solution("100", "123450"), "10");
        subTest(4, solution("12321", "42531"), "321");
        subTest(5, solution("5525", "1255"), "552");
        accepted();
    }

    public static String solution(String X, String Y) {
        int[] countX = new int[10];  // Count digits in X
        int[] countY = new int[10];  // Count digits in Y

        // Step 1: Count occurrences of each digit in X and Y
        for (char c : X.toCharArray()) {
            countX[c - '0']++;
        }
        for (char c : Y.toCharArray()) {
            countY[c - '0']++;
        }

        // Step 2: Construct the result using the minimum counts of each digit
        StringBuilder result = new StringBuilder();
        for (int i = 9; i >= 0; i--) { // Iterate from 9 to 0 (descending order)
            int minCount = Math.min(countX[i], countY[i]); // Take the minimum count
            if (minCount > 0) {
                result.append(String.valueOf(i).repeat(minCount)); // Add the digit 'minCount' times
            }
        }

        // Step 3: Handle special cases
        if (result.length() == 0) {
            return "-1";  // No common digits
        }

        // If the result is made up of only zeros (e.g. "00", "000"), return "0"
        if (result.toString().startsWith("0")) {
            return "0";
        }

        return result.toString();
    }
}