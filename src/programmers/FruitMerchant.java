package src.programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/135808

import java.util.Arrays;

public class FruitMerchant extends Solution {
    public static void main(String[] args) {
        subTest(1, solution(3, 4, new int[]{1, 2, 3, 1, 2, 3, 1}), 8);
        subTest(2, solution(4, 3, new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2}), 33);

        accepted();
    }

    public static int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        int n = score.length;

        for (int i = n - m; i >= 0; i -= m) {
            answer += m * score[i];
        }
        return answer;
    }
}