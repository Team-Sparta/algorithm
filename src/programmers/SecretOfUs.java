package src.programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/155652

public class SecretOfUs extends Solution {
    public static void main(String[] args) {
        subTest(1, solution("aukks", "wbqd", 5), "happy");
    }

    public static String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();

        for (char letter : s.toCharArray()) {
            char temp = letter;
            int idx = 0;
            while (idx < index) {
                temp = temp == 'z' ? 'a' : (char) (temp + 1);
                if (!skip.contains(String.valueOf(temp))) {
                    idx += 1;
                }
            }
            answer.append(temp);
        }

        return answer.toString();
    }
}