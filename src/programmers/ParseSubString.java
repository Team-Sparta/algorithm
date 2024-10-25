package src.programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/147355

public class ParseSubString extends Solution {
    public static void main(String[] args) {
        subTest(1, solution("3141592", "271"), 2);
        subTest(2, solution("500220839878", "7"), 8);
        subTest(3, solution("10203", "15"), 3);
        accepted();
    }

    public static int solution(String t, String p) {
        int count = 0;
        int pLength = p.length();

        for (int i = 0; i <= t.length() - pLength; i++) {
            String subStr = t.substring(i, i + pLength);
            if (subStr.compareTo(p) <= 0) count++;
        }

        return count;
    }
}
