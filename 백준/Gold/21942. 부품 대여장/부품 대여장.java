import java.io.*;
import java.util.*;
import java.time.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        String L = st.nextToken();
        int F = Integer.parseInt(st.nextToken());

        int ddd = Integer.parseInt(L.substring(0, 3));
        int hh = Integer.parseInt(L.substring(4, 6));
        int mm = Integer.parseInt(L.substring(7, 9));
        long period = ddd * 24 * 60L + hh * 60L + mm;

        Map<String, Map<String, LocalDateTime>> borrowMap = new HashMap<>();
        Map<String, Long> fineMap = new HashMap<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String dateStr = st.nextToken();
            String timeStr = st.nextToken();
            String part = st.nextToken();
            String member = st.nextToken();

            String[] dateParts = dateStr.split("-");
            String[] timeParts = timeStr.split(":");

            LocalDateTime curTime = LocalDateTime.of(
                    Integer.parseInt(dateParts[0]),
                    Integer.parseInt(dateParts[1]),
                    Integer.parseInt(dateParts[2]),
                    Integer.parseInt(timeParts[0]),
                    Integer.parseInt(timeParts[1])
            );

            borrowMap.putIfAbsent(member, new HashMap<>());
            fineMap.putIfAbsent(member, 0L);

            if (borrowMap.get(member).containsKey(part)) {
                LocalDateTime borrowTime = borrowMap.get(member).get(part);
                long minutes = Duration.between(borrowTime, curTime).toMinutes();
                borrowMap.get(member).remove(part);

                if (minutes > period) {
                    fineMap.put(member, fineMap.get(member) + (minutes - period) * F);
                }
            } else {
                borrowMap.get(member).put(part, curTime);
            }
        }

        List<String> result = new ArrayList<>();
        for (String member : fineMap.keySet()) {
            if (fineMap.get(member) > 0) result.add(member);
        }

        if (result.isEmpty()) {
            System.out.println(-1);
        } else {
            Collections.sort(result);
            for (String member : result) {
                System.out.println(member + " " + fineMap.get(member));
            }
        }
    }
}