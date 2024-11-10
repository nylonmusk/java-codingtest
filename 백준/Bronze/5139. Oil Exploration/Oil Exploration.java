import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        for (int t = 1; t <= K; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            char[][] map = new char[h][w];
            for (int i = 0; i < h; i++) {
                map[i] = br.readLine().toCharArray();
            }

            System.out.println("Data Set " + t + ":");
            StringBuilder result = new StringBuilder();
            for (int col = 0; col < w; col++) {
                int cost = 0;
                boolean foundOil = false;

                for (int row = 0; row < h; row++) {
                    char cell = map[row][col];
                    if (cell == 'X') {
                        foundOil = true;
                        break;
                    } else if (cell == 'H') {
                        cost += 3;
                    } else if (cell == 'S') {
                        cost += 1;
                    }
                }

                if (foundOil) {
                    result.append(cost).append(" ");
                } else {
                    result.append("N ");
                }
            }

            System.out.println(result.toString().trim());
            System.out.println();
        }
    }
}