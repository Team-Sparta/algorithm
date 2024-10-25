package src.programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/12940

public class GcpAndLcm extends Solution {
    public static void main(String[] args) {
        subTest(1, solution(3, 12), new int[]{3, 12});
        subTest(2, solution(2, 5), new int[]{1, 10});

        accepted();
    }

    public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = gcd(n, m);
        answer[1] = lcm(answer[0], n, m);
        return answer;
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int gcd, int a, int b) {
        return (a * b) / gcd;
    }
}
