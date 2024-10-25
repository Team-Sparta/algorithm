package src.programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/161990

public class Desktop extends Solution {
    public static void main(String[] args) {
        subTest(1, solution(new String[]{".#...", "..#..", "...#."}), new int[]{0, 1, 3, 4});
    }

    public static int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int topHeight = wallpaper.length;
        int bottomHeight = 0;
        int topWidth = wallpaper[0].length();
        int bottomWidth = 0;

        for (int i = 0; i < wallpaper.length; i++) {
            String s = wallpaper[i];
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (c == '#') {
                    topHeight = Math.min(topHeight, i);
                    bottomHeight = Math.max(bottomHeight, i);
                    topWidth = Math.min(topWidth, j);
                    bottomWidth = Math.max(bottomWidth, j);
                }
            }
        }

        answer[0] = topHeight;
        answer[1] = topWidth;
        answer[2] = bottomHeight + 1;
        answer[3] = bottomWidth + 1;
        return answer;
    }
}
