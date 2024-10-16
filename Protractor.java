// https://school.programmers.co.kr/learn/courses/30/lessons/120829

public class Protractor {
    public static void main(String[] args) {
        assert (solution(70) == 1) : "test1 failed";
        System.out.println();
        assert (solution(91) == 3) : "test2 failed";
        assert (solution(180) == 4) : "test3 failed";

    }

    public static int solution(int angle) {
        return angle < 90 ? 1 : angle == 90 ? 2 : angle < 180 ? 3 : 4;
    }
}
