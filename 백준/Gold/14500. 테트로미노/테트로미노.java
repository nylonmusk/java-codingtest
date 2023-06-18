import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[][][] poliomino = {
                {{0, 0}, {0, 1}, {0, 2}, {0, 3}},
                {{0, 0}, {1, 0}, {2, 0}, {3, 0}},
                {{0, 0}, {0, 1}, {1, 0}, {1, 1}},
                {{0, 0}, {1, 0}, {2, 0}, {2, 1}},
                {{2, 0}, {2, 1}, {1, 1}, {0, 1}},
                {{0, 0}, {0, 1}, {0, 2}, {1, 0}},
                {{0, 0}, {0, 1}, {0, 2}, {1, 2}},
                {{0, 0}, {0, 1}, {1, 0}, {2, 0}},
                {{0, 0}, {0, 1}, {1, 1}, {2, 1}},
                {{0, 0}, {1, 0}, {1, 1}, {1, 2}},
                {{1, 0}, {1, 1}, {1, 2}, {0, 2}},
                {{0, 0}, {1, 0}, {1, 1}, {2, 1}},
                {{0, 1}, {1, 1}, {1, 0}, {2, 0}},
                {{0, 0}, {0, 1}, {1, 1}, {1, 2}},
                {{1, 0}, {1, 1}, {0, 1}, {0, 2}},
                {{0, 0}, {0, 1}, {0, 2}, {1, 1}},
                {{1, 0}, {1, 1}, {1, 2}, {0, 1}},
                {{0, 0}, {1, 0}, {2, 0}, {1, 1}},
                {{1, 0}, {0, 1}, {1, 1}, {2, 1}}
        };

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] tetromino = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                tetromino[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                for (int k = 0; k < poliomino.length; k++) {
                    int sum = 0;
                    for (int m = 0; m < poliomino[0].length; m++) {
                        int x = i + poliomino[k][m][0];
                        int y = j + poliomino[k][m][1];
                        if (x >= 0 && x < N && y >= 0 && y < M) {
                            sum += tetromino[x][y];
                        }
                    }
                    max = Math.max(max, sum);
                }
            }
        }
        System.out.println(max);
    }
}
