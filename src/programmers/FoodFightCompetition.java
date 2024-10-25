package src.programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/134240

public class FoodFightCompetition extends Solution {
    public static void main(String[] args) {
        subTest(1, solution(new int[]{1, 3, 4, 6}), "1223330333221");
        subTest(2, solution(new int[]{1, 7, 1, 2}), "111303111");
        accepted();
    }

    public static String solution(int[] food) {
        StringBuilder answer = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            int count = food[i] / 2;
            if (count > 0) {
                answer.append(String.valueOf(i).repeat(count));
            }
        }

        String firstHalf = answer.toString();
        answer.append("0").append(new StringBuilder(firstHalf).reverse());

        return answer.toString();
    }
}