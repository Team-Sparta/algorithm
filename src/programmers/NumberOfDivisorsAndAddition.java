package src.programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/77884

public class NumberOfDivisorsAndAddition extends Solution {
    public static void main(String[] args) {
        subTest(1, solution(13, 17), 43);
        subTest(1, solution(24, 27), 52);

        accepted();
    }

    public static int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            if (i % Math.sqrt(i) == 0) {
                answer -= i;
            } else {
                answer += i;
            }
        }

        return answer;

    }

}