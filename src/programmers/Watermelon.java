package src.programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/12922

public class Watermelon extends Solution {
    public static void main(String[] args) {
        subTest(1, solution(3), "수박수");
        subTest(2, solution(4), "수박수박");
        accepted();
    }

    public static String solution(int n) {
//        StringBuilder answer = new StringBuilder();
//        for (int i = 0; i < n; i++) {
//            answer.append(i % 2 == 0 ? "수" : "박");
//        }
//        return answer.toString();
        return new String(new char[n / 2 + 1]).replace("\0", "수박").substring(0, n);
    }
}
