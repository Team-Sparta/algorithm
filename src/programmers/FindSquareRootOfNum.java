package src.programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/12934

public class FindSquareRootOfNum extends Solution {
    public static void main(String[] args) {
        subTest(1, solution(121), 144);
        subTest(2, solution(3), -1);
        accepted();

    }

    public static long solution(long n) {
        // Find the square root of n
        long sqrt = (long) Math.sqrt(n);

        // Check if sqrt * sqrt equals n
        if (sqrt * sqrt == n) {
            // Return (sqrt + 1) squared
            return (sqrt + 1) * (sqrt + 1);
        } else {
            // n is not a perfect square, return -1
            return -1;
        }
    }

}

