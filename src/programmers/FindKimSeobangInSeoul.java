package src.programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/12919

import java.util.Arrays;

public class FindKimSeobangInSeoul extends Solution {

    public static void main(String[] args) {
        subTest(1, solution(new String[]{"Jane", "Kim"}), "김서방은 1에 있다");
    }

    public static String solution(String[] seoul) {

//        for (int i = 0; i < seoul.length; i++) {
//            if (seoul[i].equals("Kim")) {
//                return "김서방은 " + i + "에 있다";
//            }
//        }
//        return "";

        int x = Arrays.asList(seoul).indexOf("Kim");
        return "김서방은 " + x + "에 있다";
    }
}
