package src.programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/87389

public class FindSmallestNumberForModular extends Solution {
    public static void main(String[] args) {
        subTest(1, solution(10), 3);
        subTest(2, solution(12), 11);

        accepted();
    }

    public static int solution(int n) {
        int answer = 1;
        while (n % answer != 1) {
            answer++;
        }
        return answer;
//        return IntStream.range(2, n).filter(i -> n % i == 1).findFirst().orElse(0);
    }
}
