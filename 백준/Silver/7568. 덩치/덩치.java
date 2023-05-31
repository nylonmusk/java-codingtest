import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[][] ronnie = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            ronnie[i][0] = Integer.parseInt(st.nextToken());
            ronnie[i][1] = Integer.parseInt(st.nextToken());
        }
        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = 0; j < N; j++) {
                if (i != j && ronnie[i][0] < ronnie[j][0] && ronnie[i][1] < ronnie[j][1]) {
                    count++;
                }
            }
            answer[i] = count + 1;
            sb.append(answer[i]).append(" ");
        }
        System.out.println(sb);
    }
}