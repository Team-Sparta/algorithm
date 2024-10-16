package src.programmers;

// https://school.programmers.co.kr/learn/courses/30/lessons/120807

public class CompareTwoNumbers {
    public static void main(String[] args) {
        assert solution(58, 23) == -1 : "test1 failed";
        System.out.println("test1 succeeded");

        assert solution(23, 23) == 1 : "test2 failed";
        System.out.println("test2 succeeded");

        System.out.println("All tests passed");
    }

    public static int solution(int num1, int num2) {
        return num1 == num2 ? 1 : -1;
    }
}
