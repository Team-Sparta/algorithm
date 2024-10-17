package src.programmers;

import java.util.*;

public class TurnOverNaturalNumberToMakeItToAnArray extends Solution {
    public static void main(String[] args) {
        subTest(1, solution(12345), new int[]{5, 4, 3, 2, 1});
    }

    public static int[] solution(long n) {
        // initialize int list with n size
        Queue<Integer> queue = new LinkedList<>();

        while (n > 0) {
            queue.add((int) (n % 10));
            n /= 10;
        }

        return queue.stream().mapToInt(i -> i).toArray();

//        return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();

    }

}
