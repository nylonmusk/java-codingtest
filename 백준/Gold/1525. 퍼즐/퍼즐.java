import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder board = new StringBuilder();
    static String goal = "123456780";
    static Map<String, Integer> map = new HashMap<>();
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                board.append(st.nextToken());
            }
        }
        map.put(board.toString(), 0);
        System.out.println(bfs());
    }

    static int bfs() {
        Queue<String> q = new LinkedList<>();
        q.offer(board.toString());

        while (!q.isEmpty()) {
            String now = q.poll();
            int count = map.get(now);
            int empty = now.indexOf('0');
            int x = empty % 3;
            int y = empty / 3;

            if (now.equals(goal)) return count;

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && ny >= 0 && nx <= 2 && ny <= 2) {
                    int index = ny * 3 + nx;
                    char c = now.charAt(index);
                    String next = now.replace(c, 'c').replace('0', c).replace('c', '0');

                    if (!map.containsKey(next)) {
                        q.add(next);
                        map.put(next, count + 1);
                    }
                }
            }
        }
        return -1;
    }
}
