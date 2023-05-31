import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        int[][] apart = new int[15][15];
        for (int j = 1; j <= 14; j++) {
            apart[j][1] = 1;
            apart[0][j] = j;
        }

        for (int i = 1; i <= 14; i++) {
            for (int j = 2; j <= 14; j++) {
                apart[i][j] = apart[i - 1][j] + apart[i][j - 1];
            }
        }

        while (T-- > 0) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            sb.append(apart[k][n]).append("\n");
        }
        System.out.println(sb);
    }
}
