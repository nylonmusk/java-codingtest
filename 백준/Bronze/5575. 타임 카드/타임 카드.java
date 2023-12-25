import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            
            int startH = Integer.parseInt(st.nextToken());
            int startM = Integer.parseInt(st.nextToken());
            int startS = Integer.parseInt(st.nextToken());
            int endH = Integer.parseInt(st.nextToken());
            int endM = Integer.parseInt(st.nextToken());
            int endS = Integer.parseInt(st.nextToken());

            int startTimeInSeconds = startH * 3600 + startM * 60 + startS;
            int endTimeInSeconds = endH * 3600 + endM * 60 + endS;
            int workTimeInSeconds = endTimeInSeconds - startTimeInSeconds;

            int workH = workTimeInSeconds / 3600;
            int workM = (workTimeInSeconds % 3600) / 60;
            int workS = workTimeInSeconds % 60;

            System.out.println(workH + " " + workM + " " + workS);
        }
    }
}
