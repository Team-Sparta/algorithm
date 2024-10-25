package src.programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/132267

public class Coke extends Solution {
    public static void main(String[] args) {
        subTest(1, solution(2, 1, 20), 19);
        subTest(2, solution(3, 1, 20), 9);

        accepted();
    }

    public static int solution(int a, int b, int n) {
//        int totalColas = 0;
//
//        while (n >= a) {
//            int newColas = (n / a) * b;
//            totalColas += newColas;
//
//            n = n - (n / a) * a + newColas;
//        }
//        return totalColas;
        return (n > b ? n - b : 0) / (a - b) * b;
    }

}
