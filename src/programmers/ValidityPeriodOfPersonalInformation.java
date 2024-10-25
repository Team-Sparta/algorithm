package src.programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/150370

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;

public class ValidityPeriodOfPersonalInformation extends Solution {
    public static void main(String[] args) {
        subTest(1, solution("2022.05.19", new String[]{"A 6", "B 12", "C 3"}, new String[]{"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"}), new int[]{1, 3});
    }

    public static int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> expiredPrivacies = new ArrayList<>();
        HashMap<Character, Integer> termMap = new HashMap<>();

        // Populate the termMap with terms and their respective validity periods
        for (String term : terms) {
            char termChar = term.charAt(0);
            int termValidity = Integer.parseInt(term.substring(2).trim());
            termMap.put(termChar, termValidity);
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        LocalDate todayDate = LocalDate.parse(today, formatter);

        for (int i = 0; i < privacies.length; i++) {
            String privacy = privacies[i];
            LocalDate privacyDate = LocalDate.parse(privacy.substring(0, 10), formatter);
            char privacyTerm = privacy.charAt(11);
            int termValidity = termMap.get(privacyTerm);

            // Calculate the expiration date by adding the term validity period
            LocalDate expirationDate = privacyDate.plusMonths(termValidity);

            // If the expiration date is before today, mark it as expired
            if (expirationDate.isBefore(todayDate) || expirationDate.isEqual(todayDate)) {
                expiredPrivacies.add(i + 1); // +1 for 1-based indexing
            }
        }

        // Convert the list of expired privacy indices to an int array
        return expiredPrivacies.stream().mapToInt(i -> i).toArray();
    }
}