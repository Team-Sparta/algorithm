package src.programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/12951

public class JadenCase extends Solution {
    public static void main(String[] args) {
        subTest(1, solution("3people unFollowed me"), "3people Unfollowed Me");
        subTest(2, solution(" hello   world "), " Hello   World ");
        accepted();
    }

    public static String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] words = s.toLowerCase().split("");
        boolean flag = true;

        for(String word : words) {
            answer.append(flag ? word.toUpperCase() : word);
            flag = word.equals(" ");
        }

        return answer.toString();
    }
}