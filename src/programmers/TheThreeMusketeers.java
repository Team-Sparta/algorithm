package src.programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/131705

public class TheThreeMusketeers extends Solution {

    public static void main(String[] args) {
        subTest(1, solution(new int[]{-2, 3, 0, 2, -5}), 2);
        subTest(2, solution(new int[]{-3, -2, -1, 0, 1, 2, 3}), 5);
        subTest(3, solution(new int[]{-1, 1, -1, 1}), 0);

        accepted();
    }

    static int count;
    static boolean[] visited;

    public static int solution(int[] number) {
        int answer = 0;
        visited = new boolean[number.length];

        dfs(number, number.length, 0, 3);
        answer = count;
        return answer;
    }

    public static void dfs(int[] numbers, int n, int start, int r) {
        if (r == 0) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                if (visited[i]) {
                    sum += numbers[i];
                }
            }
            if (sum == 0) {
                count++;
            }
            return;
        }

        for (int i = start; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(numbers, n, i, r - 1);
                visited[i] = false;
            }
        }
    }
}


