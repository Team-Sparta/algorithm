package src.programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/81301

public class NumericStringAndEnglishWord extends Solution {
    private static final String[] NUM_WORDS = {
            "zero", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine"
    };

    public static void main(String[] args) {
        subTest(1, solution("one4seveneight"), 1478);
        subTest(2, solution("23four5six7"), 234567);
        subTest(3, solution("2three45sixseven"), 234567);
        subTest(4, solution("123"), 123);
        accepted();
    }

    public static int solution(String s) {

        for (int i = 0; i < 10; i++) s = s.replace(NUM_WORDS[i], String.valueOf(i));
        return Integer.parseInt(s);
    }
}
