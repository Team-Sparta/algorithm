package src.programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/12901

import java.time.LocalDate;

public class Year2016 extends Solution {
    public static void main(String[] args) {
        subTest(1, solution(5, 24), "TUE");
        accepted();
    }

    public static String solution(int a, int b) {
        int monthNum = switch (a) {
            case 2 -> 31;
            case 3 -> 60;
            case 4 -> 91;
            case 5 -> 121;
            case 6 -> 152;
            case 7 -> 182;
            case 8 -> 213;
            case 9 -> 244;
            case 10 -> 274;
            case 11 -> 305;
            case 12 -> 335;
            default -> 0;
        };

        return switch ((monthNum + b) % 7) {
            case 0 -> "THU";
            case 1 -> "FRI";
            case 2 -> "SAT";
            case 3 -> "SUN";
            case 4 -> "MON";
            case 5 -> "TUE";
            case 6 -> "WED";
            default -> "";
        };
//        return LocalDate.of(2016, a, b).getDayOfWeek().toString().substring(0,3);
    }
}
