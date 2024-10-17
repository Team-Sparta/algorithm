package src.programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/12933

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class PlaceInDescendingOrderOfNum extends Solution {
    public static void main(String[] args) {
        subTest(1, solution(118372), 873211L); // Use 873211L to denote a long literal
        accepted();
    }

    public static long solution(long n) {
        String[] digits = String.valueOf(n).split("");

        Arrays.sort(digits, Comparator.reverseOrder());

        String sortedString = String.join("", digits);

        return Long.parseLong(sortedString);

//        String res = Long.toString(n).chars()
//                .mapToObj(c -> (char) c) // Convert each character code to a Character
//                .sorted((a, b) -> Character.compare(b, a)) // Sort in descending order
//                .map(String::valueOf) // Convert characters back to String
//                .collect(Collectors.joining()); // Join them into a single string
//
//        // Convert the sorted string back to a long
//        return Long.parseLong(res);

    }
}
