package src.programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/68644

import java.util.HashSet;

public class AllPossibleAddition extends Solution {
    public static void main(String[] args) {

    }
    public int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        return set.stream().sorted().mapToInt(i -> i).toArray();
    }
}
