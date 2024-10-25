package src.programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/12935

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveTheSmallestNum extends Solution {
    public static void main(String[] args) {
        subTest(1, solution(new int[]{4, 3, 2, 1}), new int[]{4, 3, 2});
        subTest(1, solution(new int[]{10}), new int[]{-1});

        accepted();
    }

    public static int[] solution(int[] arr) {

        if (arr.length == 1) return new int[]{-1};

        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }

        int[] result = new int[arr.length - 1];
        int index = 0;
        for (int num : arr) {
            if (num != min) {
                result[index++] = num;
            }
        }

        return result;

//        if (arr.length == 1) return new int[]{-1};
//        int min = Arrays.stream(arr).min().orElse(0);
//        return Arrays.stream(arr).filter(i -> i != min).toArray();
    }
}

