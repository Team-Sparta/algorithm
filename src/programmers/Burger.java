package src.programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/133502

import java.util.Stack;

public class Burger extends Solution {
    public static void main(String[] args) {
        subTest(1, solution(new int[]{2, 1, 1, 2, 3, 1, 2, 3, 1}), 2);
        subTest(2, solution(new int[]{1, 3, 2, 1, 2, 1, 3, 1, 2}), 0);
    }

    public static int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        // Iterate through the ingredient array
        for (int ing : ingredient) {
            stack.push(ing);

            // Check if the last four elements form the sequence [1, 2, 3, 1]
            if (stack.size() >= 4) {
                int size = stack.size();
                if (stack.get(size - 4) == 1 &&
                        stack.get(size - 3) == 2 &&
                        stack.get(size - 2) == 3 &&
                        stack.get(size - 1) == 1) {

                    // Pop the last four elements from the stack
                    for (int i = 0; i < 4; i++) {
                        stack.pop();
                    }

                    answer++;
                }
            }
        }

        return answer;
    }
}
