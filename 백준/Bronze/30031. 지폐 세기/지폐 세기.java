import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int horizontal = Integer.parseInt(st.nextToken());
            if (horizontal == 136) answer += 1000;
            if (horizontal == 142) answer += 5000;
            if (horizontal == 148) answer += 10000;
            if (horizontal == 154) answer += 50000;
        }
        System.out.println(answer);
    }
}