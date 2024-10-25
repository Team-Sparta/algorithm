package src.programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/161989
public class OverPainting extends Solution {
    public static void main(String[] args) {
        subTest(1, solution(8, 4, new int[]{2, 3, 6}), 2);
        subTest(2, solution(5, 4, new int[]{1, 3}), 1);
        subTest(3, solution(4, 1, new int[]{1, 2, 3, 4}), 4);
    }

    public static int solution(int n, int m, int[] section) {
        int answer = 0;
        int lastPainted = 0; // Track the last painted section

        for (int i = 0; i < section.length; i++) {
            // If the current section needs to be painted and is not covered by the last painting
            if (section[i] > lastPainted) {
                answer++; // Increment the count of painting actions
                lastPainted = section[i] + m - 1; // Update the last painted section
            }
        }

        return answer;
    }
}