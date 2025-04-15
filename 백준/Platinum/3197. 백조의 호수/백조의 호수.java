import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Swan {
    int x;
    int y;

    Swan(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    private static char[][] lake;
    private static boolean[][] visitedSwan;
    private static boolean[][] visitedWater;
    private static List<Swan> swans = new ArrayList<>();
    private static Queue<int[]> water = new LinkedList<>();
    private static Queue<int[]> nextWater = new LinkedList<>();
    private static Queue<int[]> swanQ = new LinkedList<>();
    private static Queue<int[]> nextSwanQ = new LinkedList<>();
    private static int R, C;
    private static int[] dx = {0, 0, -1, 1};
    private static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        lake = new char[R][C];
        visitedSwan = new boolean[R][C];
        visitedWater = new boolean[R][C];

        for (int i = 0; i < R; i++) {
            char[] row = br.readLine().toCharArray();
            for (int j = 0; j < C; j++) {
                lake[i][j] = row[j];
                if (lake[i][j] == 'L') {
                    swans.add(new Swan(i, j));
                }
                if (lake[i][j] != 'X') {
                    water.add(new int[]{i, j});
                    visitedWater[i][j] = true;
                }
            }
        }

        Swan swan1 = swans.get(0);
        Swan swan2 = swans.get(1);
        swanQ.add(new int[]{swan1.x, swan1.y});
        visitedSwan[swan1.x][swan1.y] = true;

        int day = 0;
        while (true) {
            if (moveSwan(swan2.x, swan2.y)) {
                System.out.println(day);
                break;
            }
            meltIce();
            swanQ = nextSwanQ;
            nextSwanQ = new LinkedList<>();
            day++;
        }
    }

    private static boolean moveSwan(int ex, int ey) {
        while (!swanQ.isEmpty()) {
            int[] cur = swanQ.poll();

            for (int i = 0; i < 4; i++) {
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];

                if (nx < 0 || ny < 0 || nx >= R || ny >= C || visitedSwan[nx][ny]) continue;

                visitedSwan[nx][ny] = true;

                if (nx == ex && ny == ey) return true;

                if (lake[nx][ny] == 'X') {
                    nextSwanQ.add(new int[]{nx, ny});
                } else {
                    swanQ.add(new int[]{nx, ny});
                }
            }
        }
        return false;
    }

    private static void meltIce() {
        int size = water.size();
        for (int i = 0; i < size; i++) {
            int[] cur = water.poll();

            for (int d = 0; d < 4; d++) {
                int nx = cur[0] + dx[d];
                int ny = cur[1] + dy[d];

                if (nx < 0 || ny < 0 || nx >= R || ny >= C || visitedWater[nx][ny]) continue;

                if (lake[nx][ny] == 'X') {
                    lake[nx][ny] = '.';
                    nextWater.add(new int[]{nx, ny});
                    visitedWater[nx][ny] = true;
                }
            }
        }

        water = nextWater;
        nextWater = new LinkedList<>();
    }
}