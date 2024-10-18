import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] square = new int[4][4];
        for (int i = 0; i < 4; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 4; j++) {
                square[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int targetSum = 0;
        for (int j = 0; j < 4; j++) {
            targetSum += square[0][j];
        }

        for (int i = 1; i < 4; i++) {
            int rowSum = 0;
            for (int j = 0; j < 4; j++) {
                rowSum += square[i][j];
            }
            if (rowSum != targetSum) {
                System.out.println("not magic");
                return;
            }
        }

        for (int j = 0; j < 4; j++) {
            int colSum = 0;
            for (int i = 0; i < 4; i++) {
                colSum += square[i][j];
            }
            if (colSum != targetSum) {
                System.out.println("not magic");
                return;
            }
        }

        System.out.println("magic");
    }
}