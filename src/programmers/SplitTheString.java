package src.programmers;

public class SplitTheString extends Solution {
    public static void main(String[] args) {

        subTest(1, solution("banana"), 3);
        subTest(2, solution("abracadabra"), 6);
        subTest(3, solution("aaabbaccccabba"), 3);
    }

    public static int solution(String s) {
        int answer = 0;
        int count1 = 1, count2 = 0;
        char firstChar = s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == firstChar) {
                count1++;
            } else {
                count2++;
            }

            if (count1 == count2) {
                answer++;
                count1 = count2 = 0;
                if (i + 1 < s.length()) {
                    firstChar = s.charAt(i + 1);
                }
            }
        }

        return count1 > 0 || count2 > 0 ? answer + 1 : answer;
    }
}