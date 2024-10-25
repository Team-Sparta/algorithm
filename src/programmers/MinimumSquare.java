package src.programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/86491

public class MinimumSquare extends Solution {
    public static void main(String[] args) {
        subTest(1, solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}}), 4000);
        accepted();
    }

    public static int solution(int[][] sizes) {
        int maxWidth = 0, maxHeight = 0;

        for (int[] size : sizes) {
            maxWidth = Math.max(maxWidth, Math.max(size[0], size[1]));
            maxHeight = Math.max(maxHeight, Math.min(size[0], size[1]));
        }

        return maxWidth * maxHeight;
    }
}
