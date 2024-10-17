package src.programmers;

// https://school.programmers.co.kr/learn/courses/30/lessons/12912
public class SumOfTwoIntegers extends Solution {

    public static void main(String[] args) {
        subTest(1, solution(3, 5), 12L);
        subTest(2, solution(3, 3), 3L);
        subTest(3, solution(5, 3), 12L);
    }

    public static long solution(int a, int b) {
        long min = Math.min(a, b);
        long max = Math.max(a, b);

        return (max - min + 1) * (min + max) / 2;
    }
}
