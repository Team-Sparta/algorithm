public class SumOfIndexOfNumbers extends Solution {
    public static void main(String[] args) {

        int test1 = solution(123);
        int answer1 = 6;
        subTest(1, test1, answer1);

        int test2 = solution(987);
        int answer2 = 24;
        subTest(2, test2, answer2);

        accepted();
    }

    public static int solution(int n) {
        int answer = 0;

        while (n > 0) {
            answer += n % 10;
//            if (n < 10) {
//                break;
//            }
            n /= 10;
        }
        return answer;
    }

}
