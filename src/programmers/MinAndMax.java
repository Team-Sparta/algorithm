package src.programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/12939

public class MinAndMax extends Solution {
    public static void main(String[] args) {
        subTest(1, solution("1 2 3 4"), "1 4");
        subTest(2, solution("-1 -2 -3 -4"), "-4 -1");
        subTest(3, solution("-1 -1"), "-1 -1");

        accepted();
    }

    public static String solution(String s) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        String[] nums = s.split(" ");
        for (String num : nums) {
            min = Math.min(min, Integer.parseInt(num));
            max = Math.max(max, Integer.parseInt(num));
        }
        return min + " " + max;
    }
}
