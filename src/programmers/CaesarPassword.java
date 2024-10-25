package src.programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/12926

public class CaesarPassword extends Solution {
    public static void main(String[] args) {
        subTest(1, solution("AB", 1), "BC");
        subTest(2, solution("z", 1), "a");
        subTest(3, solution("a B z", 4), "e F d");
    }

    public static String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                answer.append((char) ((c - base + n) % 26 + base));
            } else {
                answer.append(c);
            }
        }
        return answer.toString();
    }

}
