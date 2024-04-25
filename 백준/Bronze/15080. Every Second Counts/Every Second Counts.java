import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " : ");
        int startHour = Integer.parseInt(st.nextToken());
        int startMinute = Integer.parseInt(st.nextToken());
        int startSecond = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " : ");
        int endHour = Integer.parseInt(st.nextToken());
        int endMinute = Integer.parseInt(st.nextToken());
        int endSecond = Integer.parseInt(st.nextToken());

        int startTotalSeconds = startHour * 3600 + startMinute * 60 + startSecond;
        int endTotalSeconds = endHour * 3600 + endMinute * 60 + endSecond;

        if (endTotalSeconds < startTotalSeconds) {
            endTotalSeconds += 86400;
        }

        int secondsDifference = endTotalSeconds - startTotalSeconds;

        System.out.println(secondsDifference);
    }
}
