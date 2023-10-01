import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] computers = new int[101];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            int number = Integer.parseInt(st.nextToken());
            computers[number]++;
        }

        int answer = 0;
        for (int i = 1; i <= 100; i++) {
            if (computers[i] > 1) answer += computers[i] - 1;
        }

        System.out.println(answer);
    }
}
