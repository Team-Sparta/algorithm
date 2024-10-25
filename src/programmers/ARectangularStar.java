// https://school.programmers.co.kr/learn/courses/30/lessons/12969

package src.programmers;

import java.util.Scanner;
import java.util.stream.IntStream;

public class ARectangularStar extends Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < a * b; i++) {
            if (i % a == 0) {
                stringBuilder.append("\n");
            }
            stringBuilder.append("*");
        }
        System.out.println(stringBuilder);

//        StringBuilder sb = new StringBuilder();
//        IntStream.range(0, a).forEach(s -> sb.append("*"));
//        IntStream.range(0, b).forEach(s -> System.out.println(sb.toString()));

    }

}
