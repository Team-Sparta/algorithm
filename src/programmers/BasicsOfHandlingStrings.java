package src.programmers;

public class BasicsOfHandlingStrings extends Solution {
    public static void main(String[] args) {
        subTest(1, solution("a234") , false);
        subTest(2, solution("1234") , true);

        accepted();
    }
    public static boolean solution(String s) {
//        return isValidInteger(s)  && (s.length() == 4 ||  s.length() == 6);
        return (s.length() == 4 || s.length() == 6) && (s.split("[0-9]").length <= 0);

    }

    public static boolean isValidInteger(String s) {
        try {
            Integer.parseInt(s);
            return true; // Parsing succeeded
        } catch (NumberFormatException e) {
            return false; // Parsing failed
        }
    }
}
