package src.programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/12903

public class GetTheMiddleIndexNums extends Solution {
    public static void main(String[] args) {
        subTest(1, solution("abcde"), "c");
        subTest(2, solution("qwer"), "we");

        accepted();
    }

    public static String solution(String s) {
        return s.substring((s.length() - 1) / 2, s.length() / 2 + 1);
    }
}
