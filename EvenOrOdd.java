// https://school.programmers.co.kr/learn/courses/30/lessons/12937

public class EvenOrOdd {
    public static void main(String[] args) {
        String answer1 = "Odd";
        String test1 = solution(3);
        assert (answer1.equals(test1)) : "\n test1 failed: " + "\n Answer: " + answer1 + "\n Expected: " + test1;
        String answer2 = "Even";
        String test2 = solution(5);
        assert (answer2.equals(test2)) : "\n test2 failed: " + "\n Answer: " + answer2 + "\n Expected: " + test2;

        System.out.println("All test passed");
    }

    public static String solution(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }
}
