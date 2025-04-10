import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        long answer = 0;
        long anger = 0;
        
        for (int i = 0; i < N; i++) {
            int weather = Integer.parseInt(st.nextToken());
            if (weather == 1) {
                anger++;
            } else {
                anger--;
            }
            answer += anger;
        }

        System.out.println(answer);
    }
}