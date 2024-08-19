import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int D = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int startDay = 11;
        int startHour = 11;
        int startMinute = 11;

        int endTimeInMinutes = (D * 24 * 60) + (H * 60) + M;
        int startTimeInMinutes = (startDay * 24 * 60) + (startHour * 60) + startMinute;

        int answer = endTimeInMinutes - startTimeInMinutes;
        System.out.println(answer < 0 ? -1 : answer);
    }
}