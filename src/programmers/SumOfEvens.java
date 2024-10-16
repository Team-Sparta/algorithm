package src.programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/120831

public class SumOfEvens {
    public static void main(String[] args) {
        int test1 = solution(10);
        int answer1 = 30;
        assert (test1 == answer1) : "test1 failed: " + test1 + " is not equal to " + answer1;
        System.out.println("test1 succeeded");

        int test2 = solution(4);
        int answer2 = 6;
        assert (test2 == answer2) : "test2 failed: " + test2 + " is not equal to " + answer2;
        System.out.println("test2 succeeded");

        System.out.println("All test passed");
    }

    public static int solution(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i+=2) {
            sum += i;
        }
        return sum;
    }
}
