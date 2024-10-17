package src.programmers;
//' https://school.programmers.co.kr/learn/courses/30/lessons/12954

public class FindGapByX extends Solution {

    public static void main(String[] args) {
        subTest(1, solution(2, 5), new long[]{2, 4, 6, 8, 10});
        subTest(2, solution(4, 3), new long[]{4, 8, 12});
        subTest(3, solution(-4, 2), new long[]{-4, -8});
    }

    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] + x;
        }
        return answer;
    }

}
