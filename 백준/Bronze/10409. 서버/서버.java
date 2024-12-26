import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] tasks = new int[n];
        for (int i = 0; i < n; i++) {
            tasks[i] = Integer.parseInt(st.nextToken());
        }

        int answer = 0;
        int totalTime = 0;

        for (int i = 0; i < n; i++) {
            if (totalTime + tasks[i] <= T) {
                totalTime += tasks[i];
                answer++;
            } else {
                break;
            }
        }

        System.out.println(answer);
    }
}