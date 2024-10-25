package src.programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/118666

import java.util.HashMap;

public class PersonalityTest extends Solution {
    public static void main(String[] args) {
        subTest(1, solution(new String[]{"AN", "CF", "MJ", "RT", "NA"}, new int[]{5, 3, 2, 7, 5}), "TCMA");
        subTest(2, solution(new String[]{"TR", "RT", "TR"}, new int[]{7, 1, 3}), "RCJA");
    }

    public static String solution(String[] survey, int[] choices) {
        StringBuilder answer = new StringBuilder();
        char[][] type = {{'R', 'T'}, {'C', 'F'}, {'J', 'M'}, {'A', 'N'}};
        HashMap<Character, Integer> point = new HashMap<>();

        // Initialize points for each personality type
        for (char[] t : type) {
            point.put(t[0], 0); // Initialize for first type
            point.put(t[1], 0); // Initialize for second type
        }

        // Calculate points based on choices
        for (int idx = 0; idx < choices.length; idx++) {
            char firstType = survey[idx].charAt(0);
            char secondType = survey[idx].charAt(1);
            int choice = choices[idx];

            if (choice > 4) {
                point.put(secondType, point.get(secondType) + (choice - 4)); // Scores for second type
            } else if (choice < 4) {
                point.put(firstType, point.get(firstType) + (4 - choice)); // Scores for first type
            }
        }

        // Determine the final personality type
        for (char[] t : type) {
            answer.append(point.get(t[1]) <= point.get(t[0]) ? t[0] : t[1]);
        }

        return answer.toString();
    }
}