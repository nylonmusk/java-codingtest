import java.io.*;
import java.util.*;

public class Main {
    private static int R, C;
    private static char[][] map;
    private static int[][] distance;
    private static Queue<int[]> water = new LinkedList<>();
    private static Queue<int[]> hedgehog = new LinkedList<>();

    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        map = new char[R][C];
        distance = new int[R][C];

        for (int i = 0; i < R; i++) {
            String line = br.readLine();
            for (int j = 0; j < C; j++) {
                map[i][j] = line.charAt(j);
                if (map[i][j] == 'S') {
                    hedgehog.add(new int[]{i, j});
                    distance[i][j] = 1;
                } else if (map[i][j] == '*') {
                    water.add(new int[]{i, j});
                }
            }
        }

        System.out.println(bfs());
    }

    private static String bfs() {
        while (!hedgehog.isEmpty()) {

            int waterSize = water.size();
            for (int i = 0; i < waterSize; i++) {
                int[] cur = water.poll();
                for (int d = 0; d < 4; d++) {
                    int nx = cur[0] + dx[d];
                    int ny = cur[1] + dy[d];
                    if (nx < 0 || ny < 0 || nx >= R || ny >= C) continue;
                    if (map[nx][ny] == '.' ) {
                        map[nx][ny] = '*';
                        water.add(new int[]{nx, ny});
                    }
                }
            }

            int hedgehogSize = hedgehog.size();
            for (int i = 0; i < hedgehogSize; i++) {
                int[] cur = hedgehog.poll();
                for (int d = 0; d < 4; d++) {
                    int nx = cur[0] + dx[d];
                    int ny = cur[1] + dy[d];
                    if (nx < 0 || ny < 0 || nx >= R || ny >= C) continue;

                    if (map[nx][ny] == 'D') {
                        return String.valueOf(distance[cur[0]][cur[1]]);
                    }

                    if (map[nx][ny] == '.') {
                        map[nx][ny] = 'S';
                        distance[nx][ny] = distance[cur[0]][cur[1]] + 1;
                        hedgehog.add(new int[]{nx, ny});
                    }
                }
            }
        }
        return "KAKTUS";
    }
}