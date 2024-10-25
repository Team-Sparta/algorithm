package src.programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/12915

import java.util.Arrays;
import java.util.Comparator;

public class SortingStringsAtWill extends Solution {
    public static void main(String[] args) {
        subTest(1, solution(new String[]{"sun", "bed", "car"}, 1), new String[]{"car", "bed", "sun"});
        subTest(2, solution(new String[]{"abce", "abcd", "cdx"}, 1), new String[]{"abcd", "abce", "cdx"});

        accepted();
    }

    public static String[] solution(String[] strings, int n) {

        Arrays.sort(strings, Comparator
                .comparing((String s) -> s.charAt(n))  // Compare by character at given position
                .thenComparing(s -> s));
        return strings;
    }
}
