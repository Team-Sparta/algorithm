package src.programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/12948

public class HideYourPhoneNumber extends Solution {
    public static void main(String[] args) {
        subTest(1, solution("01033334444"), "*******4444");
        subTest(2, solution("027778888"), "*****8888");
    }

    public static String solution(String phone_number) {
//        int hiddenLength = phone_number.length() - 4;
//
//        String hiddenPart = "*".repeat(hiddenLength);
//
//        String visiblePart = phone_number.substring(hiddenLength);
//
//        return hiddenPart + visiblePart;
         return phone_number.replaceAll(".(?=.{4})", "*");
    }
}