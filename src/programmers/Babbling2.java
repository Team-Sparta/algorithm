package src.programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/133499

public class Babbling2 extends Solution {
    public static void main(String[] args) {
        subTest(1, solution(new String[]{"aya", "yee", "u", "maa"}), 1);
        subTest(2, solution(new String[]{"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"}), 2);
    }

    public static int solution(String[] babbling) {
        int answer = 0;
        String[] pronounceable = {"aya", "ye", "woo", "ma"};

        for (String word : babbling) {
            String temp = word;

            boolean isValid = true;
            for (String sound : pronounceable) {
                if (temp.contains(sound + sound)) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                for (String sound : pronounceable) {
                    temp = temp.replace(sound, " ");
                }

                if (temp.trim().isEmpty()) {
                    answer++;
                }
            }
        }
        return answer;
    }

}
