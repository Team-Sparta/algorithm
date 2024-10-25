package src.programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/160586

import java.util.HashMap;
import java.util.Map;

public class ScuffedKeyboard extends Solution {
    public static void main(String[] args) {
        subTest(1, solution(new String[]{"ABACD", "BCEFD"}, new String[]{"ABCD", "AABB"}), new int[]{9, 4});
        accepted();
    }

    public static int[] solution(String[] keymap, String[] targets) {

        Map<Character, Integer> map = new HashMap<>();

        for (String key : keymap) {
            for (int i = 0; i < key.length(); i++) {
                char c = key.charAt(i);
                map.put(c, Math.min(map.getOrDefault(c, i + 1), i + 1));
            }
        }

        int[] answer = new int[targets.length];


        for (int i = 0; i < targets.length; i++) {
            int count = 0;
            boolean canBeTyped = true;

            for (int j = 0; j < targets[i].length(); j++) {
                char c = targets[i].charAt(j);

                if (!map.containsKey(c)) {
                    count = -1;
                    canBeTyped = false;
                    break;
                }

                count += map.get(c);
            }

            // 결과 저장
            answer[i] = canBeTyped ? count : -1;
        }

        return answer;
    }
}
