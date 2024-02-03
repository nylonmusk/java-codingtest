import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    private static int N;
    private static int M;
    private static int answer = 0;
    private static int[] dx = {-1, 0, 1, 0};
    private static int[] dy = {0, 1, 0, -1};
    private static int[][] room;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        room = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                room[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        clean(r, c, d);
        System.out.println(answer);
    }

    private static void clean(int r, int c, int d) {
        if (room[r][c] == 0) {
            room[r][c] = 2;
            answer++;
        }

        boolean isDirty = false;
        for (int i = 0; i < 4; i++) {
            int nd = (d + 3) % 4;
            int nx = r + dx[nd];
            int ny = c + dy[nd];

            if (room[nx][ny] == 0) {
                clean(nx, ny, nd);
                isDirty = true;
                break;
            }
            d = nd;
        }

        if (!isDirty) {
            int nd = (d + 2) % 4;
            int nx = r + dx[nd];
            int ny = c + dy[nd];
            if (room[nx][ny] != 1) {
                clean(nx, ny, d);
            }
        }
    }
}
