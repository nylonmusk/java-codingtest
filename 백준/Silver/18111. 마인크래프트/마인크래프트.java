import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[][] blocks = new int[N][M];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                blocks[i][j] = Integer.parseInt(st.nextToken());
                min = Math.min(min, blocks[i][j]);
                max = Math.max(max, blocks[i][j]);
            }
        }

        int minTime = Integer.MAX_VALUE;
        int height = 0;

        for (int i = min; i <= max; i++) {
            int block = B;
            int time = 0;

            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (blocks[j][k] > i) {
                        time += (blocks[j][k] - i) * 2;
                        block += (blocks[j][k] - i);
                    } else if (blocks[j][k] < i) {
                        time += (i - blocks[j][k]);
                        block -= (i - blocks[j][k]);
                    }
                }
            }

            if (block >= 0 && minTime >= time) {
                minTime = time;
                height = i;
            }
        }
        System.out.println(minTime + " " + height);
    }
}
