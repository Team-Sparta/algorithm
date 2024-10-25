package src.programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/142086

import java.util.HashMap;

public class NearestNeighbors extends Solution {
    public static void main(String[] args) {
        solution("banana");
    }

    public static int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character, Integer> lastSeen = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            answer[i] = i - lastSeen.getOrDefault(currentChar, -1);

            lastSeen.put(currentChar, i);
        }
        return answer;
    }
}
