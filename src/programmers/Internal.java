package src.programmers;

import java.util.stream.IntStream;

public class Internal extends Solution {
    public static void main(String[] args) {
        subTest(1, solution(new int[] {1,2,3,4}, new int[] {-3,-1,0,2}), 3);
        subTest(2, solution(new int[] {-1,0,1}, new int[] {1,0,-1}), -2);

        accepted();
    }

    public static int solution(int[] a, int[] b) {
//        int answer = 0;
//        for (int i = 0; i < a.length; i++) {
//            answer += a[i] * b[i];
//        }
//        return answer;
        return IntStream.range(0, a.length).map(index -> a[index] * b[index]).sum();


    }
}
