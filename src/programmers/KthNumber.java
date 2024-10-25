package src.programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/42748

import java.util.Arrays;


public class KthNumber extends Solution {
    public static void main(String[] args) {
//        solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});
//        subTest(1, solution(new int[]{1, 52, 36, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}}), new int[]{5, 6, 3});
//        accepted();
    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] newArr = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(newArr);
            answer[i] = newArr[commands[i][2] - 1];
        }
        return answer;
    }
}
