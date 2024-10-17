package src.programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/12910

import java.util.Arrays;

public class ArrayOfDividedNumbers extends Solution {
    public static void main(String[] args) {
        subTest(1, solution(new int[]{5, 9, 7, 10}, 5), new int[]{5, 10});
        subTest(2, solution(new int[]{2, 36, 1, 3}, 1), new int[]{1, 2, 3, 36});
        subTest(3, solution(new int[]{3, 2, 6}, 10), new int[]{-1});
        accepted();
    }

    public static int[] solution(int[] arr, int divisor) {

        int[] result = Arrays.stream(arr)
                .filter(num -> num % divisor == 0)
                .sorted()
                .toArray();

        if (result.length == 0) {
            return new int[]{-1};
        }

        return result;
    }
}
