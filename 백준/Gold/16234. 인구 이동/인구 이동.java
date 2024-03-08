import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Location {
    int x;
    int y;

    Location(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    private static boolean isOpened;
    private static int N, L, R;
    private static int sum, count;
    private static List<Location> landList;
    private static int[][] land;
    private static boolean[][] isVisited;
    private static final int[] dx = {0, 0, -1, 1};
    private static final int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        land = new int[N][N];
        isVisited = new boolean[N][N];

        for (int r = 0; r < N; r++) {
            st = new StringTokenizer(br.readLine());
            for (int c = 0; c < N; c++) {
                land[r][c] = Integer.parseInt(st.nextToken());
            }
        }

        int answer = 0;

        while (true) {
            for (int i = 0; i < N; i++) {
                Arrays.fill(isVisited[i], false);
            }
            isOpened = false;
            for (int r = 0; r < N; r++) {
                for (int c = 0; c < N; c++) {
                    if (!isVisited[r][c]) {
                        bfs(r, c);
                        if (count != 1) changeLand();
                    }
                }
            }

            if (isOpened) answer++;
            if (!isOpened) break;
        }

        System.out.println(answer);
    }

    private static void bfs(int x, int y) {
        count = 1;
        sum = land[x][y];
        landList = new ArrayList<>();
        landList.add(new Location(x, y));
        Queue<Location> queue = new LinkedList<>();
        queue.add(new Location(x, y));
        isVisited[x][y] = true;

        while (!queue.isEmpty()) {
            Location now = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < N && ny < N && !isVisited[nx][ny] && isValid(land[nx][ny], land[now.x][now.y])) {
                    isOpened = true;
                    isVisited[nx][ny] = true;
                    queue.add((new Location(nx, ny)));
                    sum += land[nx][ny];
                    count++;
                    landList.add(new Location(nx, ny));
                }
            }
        }
    }

    private static boolean isValid(int location1, int location2) {
        return L <= Math.abs(location1 - location2) && Math.abs(location1 - location2) <= R;
    }

    private static void changeLand() {
        int people = sum / count;
        for (Location location : landList) {
            land[location.x][location.y] = people;
        }
    }
}