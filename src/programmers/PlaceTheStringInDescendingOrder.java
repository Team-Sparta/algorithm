package src.programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/12917

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PlaceTheStringInDescendingOrder extends Solution {
    public static void main(String[] args) {

    }

    public static String solution(String s) {
        List<Integer> list = new ArrayList<>();

        // Convert characters to their ASCII values
        for (char c : s.toCharArray()) {
            list.add((int) c);
        }

        // Sort the list of ASCII values
        list.sort(Collections.reverseOrder());

        // Convert sorted ASCII values back to characters and build the result string
        StringBuilder answer = new StringBuilder();
        for (int num : list) {
            answer.append((char) num);
        }

        return answer.toString();


//        char[] sol = s.toCharArray();
//        Arrays.sort(sol);
//        return new StringBuilder(new String(sol)).reverse().toString();
    }
}
