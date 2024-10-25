package src.programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/12945

public class Fibonacci extends Solution {
    static long[] memo = new long[1001];

    public static void main(String[] args) {
        subTest(1, solution(3), 2);
        subTest(2, solution(5), 5);
    }

    public static long solution(int n) {
        if (n <= 1) {
            return n;
        } else if (memo[n] != 0) {
            return memo[n];
        } else {
            return memo[n] = solution(n - 1) + solution(n - 2) % 1234567;
        }
    }

}