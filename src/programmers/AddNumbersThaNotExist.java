package src.programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/86051

import java.util.Arrays;

public class AddNumbersThaNotExist extends Solution {
    public static void main(String[] args) {
        subTest(1, solution(new int[] {1,2,3,4,6,7,8,0}), 14);
        subTest(2, solution(new int[] {5,8,4,0,6,7,9}), 6);
        accepted();

    }

    public static int solution(int[] numbers) {
        return 45 - Arrays.stream(numbers).sum();
    }

}
