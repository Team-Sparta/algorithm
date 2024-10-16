package src.programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/120817
// https://school.programmers.co.kr/learn/courses/30/lessons/12944

import java.util.Arrays;

public class FindAverageOfList {
    public static void main(String[] args) {
        int[] test1Input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double test1 = solution(test1Input);
        double answer1 = 5.5;
        assert (test1 == answer1) : "test1 failed: " + test1 + "is not equal to " + answer1;
        System.out.println("test1 successful");

        int[] test2Input = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
        double test2 = solution(test2Input);
        double answer2 = 94.0;
        assert (test2 == answer2) : "test2 failed: " + test2 + "is not equal to " + answer2;
        System.out.println("test2 successful");

        System.out.println("All tests passed");

    }

    public static double solution(int[] numbers) {
//        double answer = 0;
//        for (int number : numbers) {
//            answer += number;
//        }
//        return answer / numbers.length;

        return Arrays.stream(numbers).average().orElse(0);
    }
}
