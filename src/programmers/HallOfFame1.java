package src.programmers;

import java.util.PriorityQueue;
// https://school.programmers.co.kr/learn/courses/30/lessons/138477

public class HallOfFame1 extends Solution {
    public static void main(String[] args) {
        subTest(1, solution(3, new int[]{10, 100, 20, 150, 1, 100, 200}), new int[]{10, 10, 10, 20, 20, 100, 100});
        accepted();
    }

    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> hallOfFame = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            // Add new score to the hall of fame
            hallOfFame.add(score[i]);

            // If there are more than k scores, remove the smallest one
            if (hallOfFame.size() > k) {
                hallOfFame.poll(); // Remove the lowest score
            }

            // The smallest score in the hall of fame is the top k-th score
            answer[i] = hallOfFame.peek();
        }

        return answer;
    }


}
