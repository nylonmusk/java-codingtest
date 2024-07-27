import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String s = null;

        StringBuilder answer = new StringBuilder();
        while (!(s = br.readLine()).equals("00:00 00:00")) {
            st = new StringTokenizer(s);
            StringTokenizer ss = new StringTokenizer(st.nextToken(), ":");
            int startHour = Integer.parseInt(ss.nextToken());
            int startMinute = Integer.parseInt(ss.nextToken());

            ss = new StringTokenizer(st.nextToken(), ":");
            int endHour = Integer.parseInt(ss.nextToken());
            int endMinute = Integer.parseInt(ss.nextToken());

            int totalHour = startHour + endHour;
            int totalMinute = startMinute + endMinute;

            totalHour += totalMinute / 60;
            totalMinute %= 60;

            int day = totalHour / 24;
            totalHour %= 24;

            answer.append(totalHour <= 9 ? "0" + totalHour : totalHour).append(":").append(totalMinute <= 9 ? "0" + totalMinute : totalMinute);
            if (day > 0) {
                answer.append(" +").append(day);
            }
            answer.append("\n");
        }
        System.out.println(answer);
    }
}