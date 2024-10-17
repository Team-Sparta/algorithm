package src.programmers;

public class Solution {

    public static void subTestPassed(int num) {
        System.out.println("Test" + num + " passed");
    }

    public static <T> void subTest(int num, T answer, T expected) {
        assert expected.equals(answer) : "\nTest" + num + " failed" + "\nYour Answer: " + answer + "\nExpected: " + expected;
        subTestPassed(num);
    }

    public static void accepted() {
        System.out.println("Accepted");
    }
}
