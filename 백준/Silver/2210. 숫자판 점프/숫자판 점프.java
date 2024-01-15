import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    private static Set<String> answer = new HashSet<>();
    private static int[][] digits = new int[5][5];
    private static final int[] dx = {-1, 1, 0, 0};
    private static final int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                int digit = Integer.parseInt(st.nextToken());
                digits[i][j] = digit;
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                dfs(i, j, new StringBuilder());
            }
        }

        System.out.println(answer.size());
    }

    private static void dfs(int x, int y, StringBuilder s) {
        if (s.length() == 6) {
            answer.add(s.toString());
            return;
        }

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < 5 && ny < 5) {
                dfs(nx, ny, new StringBuilder(s).append(digits[nx][ny]));
            }
        }
    }
}
