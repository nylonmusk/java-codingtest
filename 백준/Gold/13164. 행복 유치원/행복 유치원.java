import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] heights = new int[N];
        for (int i = 0; i < N; i++) {
            heights[i] = Integer.parseInt(st.nextToken());
        }

        int[] heightDifference = new int[N - 1];

        for (int i = 0; i < N - 1; i++) {
            heightDifference[i] = heights[i + 1] - heights[i];
        }

        Arrays.sort(heightDifference);

        int answer = 0;
        for (int i = 0; i < N - K; i++) {
            answer += heightDifference[i];
        }
        System.out.println(answer);

    }
}
