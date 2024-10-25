package src.programmers;

import java.util.Arrays;

public class SportsUniform extends Solution {
    public static void main(String[] args) {
        subTest(1, solution(5, new int[]{2, 4}, new int[]{1, 3, 5}), 5);
        subTest(2, solution(5, new int[]{2, 4}, new int[]{3}), 4);
        subTest(3, solution(5, new int[]{3}, new int[]{1}), 4);
        accepted();
    }

    public static int solution(int n, int[] lost, int[] reserve) {
        int[] students = new int[n];  // 0: no extra, -1: lost, +1: has reserve

        // Mark lost uniforms
        for (int l : lost) {
            students[l - 1]--;
        }

        // Mark reserve uniforms
        for (int r : reserve) {
            students[r - 1]++;
        }


        // Now lend uniforms to neighbors
        for (int i = 0; i < n; i++) {
            if (students[i] == -1) {  // Only consider students who lost a uniform
                if (i > 0 && students[i - 1] == 1) {
                    students[i]++;
                    students[i - 1]--;
                } else if (i < n - 1 && students[i + 1] == 1) {
                    students[i]++;
                    students[i + 1]--;
                } else {
                    n--;
                }
            }
        }

        // Count students who have at least 0 uniform
        return n;
    }
}