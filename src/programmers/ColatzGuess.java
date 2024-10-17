package src.programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/12943

public class ColatzGuess extends Solution {
    public static void main(String[] args) {
        subTest(1, solution(6), 8);
        subTest(2, solution(16), 4);
        subTest(3, solution(626331), -1);
    }


    public static int solution(int num) {
        long n = num;

        for (int i = 0; i < 500; i++) {
            if (n == 1) return i;
            n = (n % 2 == 0) ? n / 2 : n * 3 + 1;
        }
        return -1;
    }
}
