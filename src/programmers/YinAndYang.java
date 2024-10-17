package src.programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/76501

public class YinAndYang extends Solution {
    public static void main(String[] args) {
        subTest(1, solution(new int[]{4, 7, 12}, new boolean[]{true, false, true}), 9);
        subTest(2, solution(new int[]{1, 2, 3}, new boolean[]{false, false, true}), 0);

    }

    public static int solution(int[] absolutes, boolean[] signs) {
        int result = 0;
        for (int i = 0; i < absolutes.length; i++) {
            result += signs[i] ? absolutes[i] : -absolutes[i];
        }
        return result;
    }


}
