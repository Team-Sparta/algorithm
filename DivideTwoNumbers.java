// https://school.programmers.co.kr/learn/courses/30/lessons/120805

public class DivideTwoNumbers {
    public static void main(String[] args) {
        assert (solution(99, 12) == 8) : "test1 failed";
        System.out.println("test1 succeeded");

        System.out.println("All tests passed");
    }

    public static int solution(int num1, int num2) {
        return num1 / num2;
    }
}
