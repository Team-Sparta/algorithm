package src.programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/12925

public class ConvertStringIntoNum extends Solution {
    public static void main(String[] args) {
        subTest(1, solution("1234"), 1234);
        accepted();
    }

    public static int solution(String s) {
        return Integer.parseInt(s);
    }
}
