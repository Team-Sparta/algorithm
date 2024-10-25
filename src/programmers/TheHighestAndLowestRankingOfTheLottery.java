package src.programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/77484

import java.util.HashSet;
import java.util.Set;

public class TheHighestAndLowestRankingOfTheLottery extends Solution {
    public static void main(String[] args) {
        subTest(1, solution(new int[]{44, 1, 0, 0, 31, 25}, new int[]{31, 10, 45, 1, 6, 19}), new int[]{3, 5});
    }

    public static int[] solution(int[] lottos, int[] win_nums) {
        Set<Integer> winningSet = new HashSet<>();
        for (int num : win_nums) {
            winningSet.add(num);
        }

        int matchCount = 0;
        int zeroCount = 0;

        for (int num : lottos) {
            if (num == 0) {
                zeroCount++;
            } else if (winningSet.contains(num)) {
                matchCount++;
            }
        }

        return new int[]{getRank(matchCount + zeroCount), getRank(matchCount)};
    }

    // Helper method to get rank based on number of matches
    private static int getRank(int matches) {
        return switch (matches) {
            case 6 -> 1;
            case 5 -> 2;
            case 4 -> 3;
            case 3 -> 4;
            case 2 -> 5;
            default -> 6;
        };
    }
}