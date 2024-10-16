package src.programmers;

public class Solution {

    public static void subTestPassed(int num) {
        System.out.println("Test" + num + " passed");
    }

    public static <T> void subTest(int num, T answer, T expected) {
        assert answer == expected : "\nTest" + num + " failed" + "\nYour Answer: " + answer + "\nExpected: " + expected;
        subTestPassed(1);
    }

    public static void accepted() {
        System.out.println("Accepted");
    }
}
