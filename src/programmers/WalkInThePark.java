package src.programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/172928

public class WalkInThePark extends Solution {
    public static void main(String[] args) {
        subTest(1, solution(new String[]{"SOO", "OOO", "OOO"}, new String[]{"E 2", "S 2", "W 1"}), new int[]{2, 1});
        accepted();
    }

    public static int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int rows = park.length;
        int cols = park[0].length();

        // Find starting point efficiently
        for (int i = 0; i < rows; i++) {
            int startIdx = park[i].indexOf('S');
            if (startIdx != -1) {
                answer[0] = i;
                answer[1] = startIdx;
                break;
            }
        }

        // Process each route
        for (String route : routes) {
            char direction = route.charAt(0);
            int steps = route.charAt(2) - '0'; // assuming 1-digit steps, replace with proper parsing for multi-digits


            int dx = (direction == 'N' ? -1 : (direction == 'S' ? 1 : 0));
            int dy = (direction == 'W' ? -1 : (direction == 'E' ? 1 : 0));

            // Check if the path is valid and move
            if (isValid(answer[0], answer[1], dx, dy, steps, rows, cols, park)) {
                answer[0] += dx * steps;
                answer[1] += dy * steps;
            }
        }

        return answer;
    }

    // Helper function to check the validity of the path
    static boolean isValid(int x, int y, int dx, int dy, int steps, int rows, int cols, String[] park) {
        for (int i = 1; i <= steps; i++) {
            int newX = x + i * dx;
            int newY = y + i * dy;
            if (newX < 0 || newX >= rows || newY < 0 || newY >= cols || park[newX].charAt(newY) == 'X') {
                return false;
            }
        }
        return true;
    }
}