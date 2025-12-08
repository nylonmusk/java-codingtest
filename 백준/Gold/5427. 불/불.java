import java.io.*;
import java.util.*;

public class Main {
    private static int w, h;
    private static char[][] map;
    private static int[][] fireTime, personTime;
    private static int[] dx = {1, -1, 0, 0};
    private static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            map = new char[h][w];
            fireTime = new int[h][w];
            personTime = new int[h][w];

            Queue<int[]> fireQ = new ArrayDeque<>();
            Queue<int[]> personQ = new ArrayDeque<>();

            for (int i = 0; i < h; i++) {
                Arrays.fill(fireTime[i], -1);
                Arrays.fill(personTime[i], -1);
            }


            for (int i = 0; i < h; i++) {
                String line = br.readLine();
                for (int j = 0; j < w; j++) {
                    map[i][j] = line.charAt(j);
                    if (map[i][j] == '*') {
                        fireQ.add(new int[]{i, j});
                        fireTime[i][j] = 0;
                    }
                    if (map[i][j] == '@') {
                        personQ.add(new int[]{i, j});
                        personTime[i][j] = 0;
                    }
                }
            }

            while (!fireQ.isEmpty()) {
                int[] cur = fireQ.poll();
                int x = cur[0], y = cur[1];
                for (int d = 0; d < 4; d++) {
                    int nx = x + dx[d];
                    int ny = y + dy[d];
                    if (nx < 0 || ny < 0 || nx >= h || ny >= w) continue;
                    if (map[nx][ny] == '#') continue;
                    if (fireTime[nx][ny] != -1) continue;
                    fireTime[nx][ny] = fireTime[x][y] + 1;
                    fireQ.add(new int[]{nx, ny});
                }
            }

            int answer = -1;

            while (!personQ.isEmpty()) {
                int[] cur = personQ.poll();
                int x = cur[0], y = cur[1];

                if (x == 0 || y == 0 || x == h - 1 || y == w - 1) {
                    answer = personTime[x][y] + 1;
                    break;
                }

                for (int d = 0; d < 4; d++) {
                    int nx = x + dx[d];
                    int ny = y + dy[d];
                    if (nx < 0 || ny < 0 || nx >= h || ny >= w) continue;
                    if (map[nx][ny] == '#') continue;
                    if (personTime[nx][ny] != -1) continue;

                    int nextTime = personTime[x][y] + 1;

                    if (fireTime[nx][ny] != -1 && fireTime[nx][ny] <= nextTime) continue;

                    personTime[nx][ny] = nextTime;
                    personQ.add(new int[]{nx, ny});
                }
            }

            if (answer == -1) sb.append("IMPOSSIBLE\n");
            else sb.append(answer).append("\n");
        }

        System.out.print(sb);
    }
}