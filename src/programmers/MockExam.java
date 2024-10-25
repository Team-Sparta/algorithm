package src.programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/42840

import java.util.ArrayList;
import java.util.List;

public class MockExam extends Solution {
    public static void main(String[] args) {
        solution(new int[]{1, 3, 2, 4, 2});
    }

    public static int[] solution(int[] answers) {
        int[] pattern1 = new int[]{1, 2, 3, 4, 5};
        int[] pattern2 = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] pattern3 = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = new int[3];


        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == pattern1[i % pattern1.length]) {
                score[0]++;
            }
            if (answers[i] == pattern2[i % pattern2.length]) {
                score[1]++;
            }
            if (answers[i] == pattern3[i % pattern3.length]) {
                score[2]++;
            }
        }

        List<Integer> result = new ArrayList<>();

        // Find the maximum value among c1, c2, and c3
        int max = Math.max(score[0], Math.max(score[1], score[2]));

        // Add the corresponding indices based on which are the biggest
        if (score[0] == max) {
            result.add(1);
        }
        if (score[1] == max) {
            result.add(2);
        }
        if (score[2] == max) {
            result.add(3);
        }

        return result.stream().mapToInt(i -> i).toArray();

    }
}
