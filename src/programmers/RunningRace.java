package src.programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/178871

import java.util.*;

public class RunningRace extends Solution {
    public static void main(String[] args) {
        subTest(1, solution(new String[]{"mumu", "soe", "poe", "kai", "mine"}, new String[]{"kai", "kai", "mine", "mine"}), new String[]{"mumu", "kai", "mine", "soe", "poe"});
    }

    public static String[] solution(String[] players, String[] callings) {
        Map<String, Integer> playerPositions = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            playerPositions.put(players[i], i);
        }

        // Process each calling
        for (String calling : callings) {
            int index = playerPositions.get(calling);

            // Swap the current player with the one in front
            if (index > 0) {
                String previousPlayer = players[index - 1];

                // Swap positions in the array
                players[index] = previousPlayer;
                players[index - 1] = calling;

                // Update the player positions in the map
                playerPositions.put(calling, index - 1);
                playerPositions.put(previousPlayer, index);
            }
        }
        return players;
    }
}
