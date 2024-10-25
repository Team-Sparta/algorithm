package src.programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/159994/solution_groups?language=java

public class CardBundle extends Solution {
    public static void main(String[] args) {
        subTest(1, solution(new String[]{"i", "drink", "water"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"}), "Yes");
        subTest(2, solution(new String[]{"i", "water", "drink"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"}), "No");
        accepted();
    }

    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        int card1Idx = 0;
        int card2Idx = 0;

        for (String card : goal) {
            if (card1Idx < cards1.length && cards1[card1Idx].equals(card)) {
                card1Idx++;
            } else if (card2Idx < cards2.length && cards2[card2Idx].equals(card)) {
                card2Idx++;
            } else {
                return "No";
            }
        }

        return "Yes";
    }
}