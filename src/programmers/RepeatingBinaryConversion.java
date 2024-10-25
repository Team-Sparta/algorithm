package src.programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/70129

public class RepeatingBinaryConversion extends Solution {
    public static void main(String[] args) {
        subTest(1, solution("110010101001"), new int[]{3, 8});
        subTest(2, solution("01110"), new int[]{3, 3});
        subTest(3, solution("1111111"), new int[]{4, 1});
    }

    public static int[] solution(String s) {
        int[] answer = new int[2];  // answer[0] will store number of transformations, answer[1] will store count of removed zeros

        String str = s;

        while (!"1".equals(str)) {

            int originalLength = str.length();
            str = str.replaceAll("0", "");  // Remove all zeros
            int newLength = str.length();

            answer[0]++;
            answer[1] += (originalLength - newLength);  // Count removed zeros

            str = Long.toBinaryString(str.length());
        }

        return answer;
    }
}