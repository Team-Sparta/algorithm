package src.programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/136798

public class TheWeaponOfTheKnight extends Solution {
    public static void main(String[] args) {
        subTest(1, solution(5, 3, 2), 10);
        subTest(2, solution(10, 3, 2), 21);
        accepted();
    }

    public static int solution(int number, int limit, int power) {
        int answer = 0;

        // Iterate from 1 to number, counting divisors
        for (int i = 1; i <= number; i++) {
            int divisors = countDivisors(i);
            answer += (divisors > limit) ? power : divisors;
        }
        return answer;
    }

    // Count divisors efficiently by iterating up to √num
    public static int countDivisors(int num) {
        int count = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                count++; // i is a divisor
                if (i != num / i) count++; // num / i is also a divisor
            }
        }
        return count;
    }
}