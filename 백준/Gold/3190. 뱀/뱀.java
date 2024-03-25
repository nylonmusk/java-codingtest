import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    static char[][] board;
    static int answer, x, y, nowDirection, N;
    static Deque<int[]> snake = new LinkedList<>();
    static Map<Integer, Character> rotate = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());
        board = new char[N][N];
        for (char[] b : board) {
            Arrays.fill(b, '.');
        }

        board[0][0] = 'S';
        snake.addFirst(new int[]{0, 0});

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()) - 1;
            int y = Integer.parseInt(st.nextToken()) - 1;
            board[x][y] = 'A';
        }

        int L = Integer.parseInt(br.readLine());
        for (int i = 0; i < L; i++) {
            st = new StringTokenizer(br.readLine());
            int X = Integer.parseInt(st.nextToken());
            char C = st.nextToken().charAt(0);
            rotate.put(X, C);
        }

        start();
        System.out.println(answer);
    }

    private static void start() {
        while (true) {
            answer++;
            x = snake.peekFirst()[0];
            y = snake.peekFirst()[1];

            changeDirection();

            if (!isNotWall(x, y) || board[x][y] == 'S') return;

            if (!isApple(x, y)) {
                int[] tail = snake.pollLast();
                board[tail[0]][tail[1]] = '.';
            }
            snake.addFirst(new int[]{x, y});
            board[x][y] = 'S';

            rotate();
        }

    }

    private static void changeDirection() {
        if (nowDirection == 0) {
            y += 1;
        } else if (nowDirection == 1) {
            x += 1;
        } else if (nowDirection == 2) {
            y -= 1;
        } else if (nowDirection == 3) {
            x -= 1;
        }
    }

    private static void rotate() {
        if (rotate.containsKey(answer)) {
            if (rotate.get(answer) == 'D') {
                nowDirection = (nowDirection + 1) % 4;
            } else {
                nowDirection = nowDirection - 1 >= 0 ? nowDirection - 1 : 3;
            }
        }
    }

    private static boolean isNotWall(int x, int y) {
        return (x >= 0 && y >= 0 && x < N && y < N);
    }

    private static boolean isApple(int x, int y) {
        return board[x][y] == 'A';
    }
}
