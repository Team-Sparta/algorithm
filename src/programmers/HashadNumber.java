package src.programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/12947

public class HashadNumber extends Solution {
    public static void main(String[] args) {
        subTest(1, solution(10), true);
        subTest(2, solution(12), true);
        subTest(3, solution(11), false);
        accepted();
    }

    public static boolean solution(int x) {
        int copyX = x;
        int temp = 0;
        while (copyX > 0) {
            temp += copyX % 10;
            copyX /= 10;
        }
        return x % temp == 0;

        // int sum = String.valueOf(x).chars().map(ch -> ch - '0').sum();
        // return x % sum == 0;
    }
}
