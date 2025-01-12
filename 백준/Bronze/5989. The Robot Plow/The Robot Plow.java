import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        int I = Integer.parseInt(st.nextToken());

        boolean[][] field = new boolean[X + 1][Y + 1];

        for (int i = 0; i < I; i++) {
            st = new StringTokenizer(br.readLine());
            int Xll = Integer.parseInt(st.nextToken());
            int Yll = Integer.parseInt(st.nextToken());
            int Xur = Integer.parseInt(st.nextToken());
            int Yur = Integer.parseInt(st.nextToken());

            for (int x = Xll; x <= Xur; x++) {
                for (int y = Yll; y <= Yur; y++) {
                    field[x][y] = true;
                }
            }
        }

        int answer = 0;
        for (int x = 1; x <= X; x++) {
            for (int y = 1; y <= Y; y++) {
                if (field[x][y]) {
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}