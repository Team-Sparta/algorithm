package src.programmers;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/12977
public class MakePrime extends Solution {
    public static void main(String[] args) {
        subTest(1, solution(new int[]{1, 2, 3, 4}), 1);
        subTest(2, solution(new int[]{1, 2, 7, 6, 4}), 4);
    }

    public static int solution(int[] nums) {
        int answer = 0;
        int maxSum = 3000; // Maximum possible sum (3 * 1000)

        boolean[] isPrime = new boolean[maxSum + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false; // 0 and 1 are not prime

        for (int i = 2; i * i <= maxSum; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= maxSum; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Loop through all combinations of three numbers
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    // Check if the sum is a prime number using the precomputed array
                    if (isPrime[sum]) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}