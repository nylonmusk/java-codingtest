import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        int[][] D = new int[10001][4];

        D[1][1] = 1;
        D[1][2] = 0;
        D[1][3] = 0;

        D[2][1] = 1;
        D[2][2] = 1;
        D[2][3] = 0;

        D[3][1] = 1;
        D[3][2] = 1;
        D[3][3] = 1;

        for (int i = 4; i < 10001; i++) {
            D[i][1] = D[i - 1][1];
            D[i][2] = D[i - 2][1] + D[i - 2][2];
            D[i][3] = D[i - 3][1] + D[i - 3][2] + D[i - 3][3];
        }

        StringBuilder answer = new StringBuilder();

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            answer.append(D[N][1] + D[N][2] + D[N][3]).append("\n");
        }

        System.out.println(answer);
    }
}