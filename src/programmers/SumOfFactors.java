package src.programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/12928

public class SumOfFactors extends Solution {

    public static void main(String[] args) {

        subTest(1, solution(12), 28);

        subTest(2, solution(5), 6);

        accepted();
    }

    public static int solution(int n) {
        int answer = n;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }
        return answer;
    }
}
