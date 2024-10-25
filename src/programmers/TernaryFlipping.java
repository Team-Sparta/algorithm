package src.programmers;

public class TernaryFlipping extends Solution {
    public static void main(String[] args) {

        subTest(1, solution(45), 7);
        subTest(2, solution(125), 229);

        accepted();
    }

    public static int solution(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 3);
            n /= 3;
        }

        return Integer.parseInt(sb.toString(), 3);
    }
}
