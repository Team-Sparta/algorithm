package src.programmers;// https://school.programmers.co.kr/learn/courses/30/lessons/120806

public class DivideTwoNumbersAndMultiply1000 {

    public static void main(String[] args) {
        assert (solution(3, 2) == 1500) : "test1 failed";
        System.out.println("test1 succeeded");

        assert (solution(7, 3) == 2333) : "test2 failed";
        System.out.println("test2 succeeded");

        assert (solution(1, 36) == 27) : "test3 failed";
        System.out.println("test3 succeeded");
    }

    public static int solution(int num1, int num2) {
        return (int) ((double) num1 / num2 * 1000);
    }
}
