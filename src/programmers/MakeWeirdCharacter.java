package src.programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/12930

public class MakeWeirdCharacter extends Solution {
    public static void main(String[] args) {
        subTest(1, solution("try hello world"), "TrY HeLlO WoRlD");
    }

    public static String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int index = 0;

        for (char ch : s.toCharArray()) {
            answer.append(ch == ' ' ? ' ' : (index++ % 2 == 0 ? Character.toUpperCase(ch) : Character.toLowerCase(ch)));
            if (ch == ' ') index = 0; // Reset index for a new word
        }

        return answer.toString();

    }
}
