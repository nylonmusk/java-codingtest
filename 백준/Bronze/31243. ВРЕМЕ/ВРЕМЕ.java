import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    private static int toMinutes(int hours, int minutes) {
        return hours * 60 + minutes;
    }

    private static String toTimeFormat(int totalMinutes) {
        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;
        return String.format("%d:%02d", hours, minutes);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int minTime = Integer.MAX_VALUE;
        int maxTime = Integer.MIN_VALUE;

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int startHour = Integer.parseInt(st.nextToken());
            int startMinute = Integer.parseInt(st.nextToken());
            int endHour = Integer.parseInt(st.nextToken());
            int endMinute = Integer.parseInt(st.nextToken());

            int startTime = toMinutes(startHour, startMinute);
            int endTime = toMinutes(endHour, endMinute);

            if (endTime < startTime) {
                endTime += 24 * 60;
            }

            int travelTime = endTime - startTime;

            minTime = Math.min(minTime, travelTime);
            maxTime = Math.max(maxTime, travelTime);
        }

        System.out.println(toTimeFormat(minTime));
        System.out.println(toTimeFormat(maxTime));
    }
}