import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static char[][] map;
    static char[][] newMap;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int R;
    static int C;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        map = new char[R][C];
        newMap = new char[R][C];

        for (int i = 0; i < R; i++) {
            String s = br.readLine();
            for (int j = 0; j < C; j++) {
                map[i][j] = s.charAt(j);
                newMap[i][j] = s.charAt(j);
            }
        }

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (map[i][j] == 'X') {
                    getNewMap(i, j);
                }
            }
        }

        int[] point = getMinimumMap();

        StringBuilder answer = new StringBuilder();

        for (int i = point[0]; i <= point[2]; i++) {
            for (int j = point[1]; j <= point[3]; j++) {
                answer.append(newMap[i][j]);
            }
            answer.append("\n");
        }

        System.out.println(answer);
    }

    private static void getNewMap(int x, int y) {
        int count = 0;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || ny < 0 || nx >= R || ny >= C || map[nx][ny] == '.') {
                count++;
            }
        }

        if (count == 3 || count == 4) {
            newMap[x][y] = '.';
        }
    }

    private static int[] getMinimumMap() {
        int minX = R - 1;
        int minY = C - 1;
        int maxX = 0;
        int maxY = 0;

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (newMap[i][j] == 'X') {
                    minX = Math.min(minX, i);
                    minY = Math.min(minY, j);
                    maxX = Math.max(maxX, i);
                    maxY = Math.max(maxY, j);
                }
            }
        }
        return new int[]{minX, minY, maxX, maxY};
    }
}
