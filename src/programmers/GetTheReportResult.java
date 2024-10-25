package src.programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/92334

import java.util.*;


public class GetTheReportResult extends Solution {
    public static void main(String[] args) {
        subTest(1, solution(new String[]{"muzi", "frodo", "apeach", "neo"},
                        new String[]{"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"}, 2),
                new int[]{2, 1, 1, 0});
        accepted();
    }

    public static int[] solution(String[] id_list, String[] report, int k) {
//        int n = id_list.length;
//        int[] answer = new int[n];
//
//        // Create a map to track the index of each user in the answer array
//        Map<String, Integer> idIndexMap = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            idIndexMap.put(id_list[i], i);
//        }
//
//        // Map each reported user to the set of unique reporters
//        Map<String, Set<String>> reportMap = new HashMap<>();
//        for (String r : report) {
//            String[] ids = r.split(" ");
//            String reporter = ids[0];
//            String troll = ids[1];
//            reportMap.computeIfAbsent(troll, v -> new HashSet<>()).add(reporter);
//        }
//
//        // Process the reports and increment counts for valid reporters
//        for (Map.Entry<String, Set<String>> entry : reportMap.entrySet()) {
//            Set<String> reporters = entry.getValue();
//            if (reporters.size() >= k) {
//                for (String reporter : reporters) {
//                    // Increment the reporter's notification count in the answer array
//                    answer[idIndexMap.get(reporter)]++;
//                }
//            }
//        }
//        return answer;

        List<String> list = Arrays.stream(report).distinct().toList();
        HashMap<String, Integer> count = new HashMap<>();
        for (String s : list) {
            String target = s.split(" ")[1];
            count.put(target, count.getOrDefault(target, 0) + 1);
        }

        return Arrays.stream(id_list).map(_user -> {
            final String user = _user;
            List<String> reportList = list.stream().filter(s -> s.startsWith(user + " ")).toList();
            System.out.println(reportList);
            return reportList.stream().filter(s -> count.getOrDefault(s.split(" ")[1], 0) >= k).count();
        }).mapToInt(Long::intValue).toArray();
    }
}