package src.programmers;// https://school.programmers.co.kr/learn/courses/30/lessons/120803

public class SubtractTwoNumbers {

    public static void main(String[] args) {
        assert (solution(3, 4) == -1) : "test1 failed";
        System.out.println("test1 succeeded");

        System.out.println("All tests passed");
    }

    public static int solution(int num1, int num2) {
        return num1 - num2;
    }
}
