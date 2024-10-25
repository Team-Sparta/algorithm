package src.programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/82612

public class CountingTheShortAmount extends Solution {
    public static void main(String[] args) {

    }

    public long solution(int price, int money, int count) {
//        long total = 0;
//        for (int i = 1; i <= count; i++) {
//            total += (long) price * i;
//        }
//        return money < total ? total - money : 0;

        return Math.max(price * (count * (count + 1) / 2) - money, 0);
    }
}
