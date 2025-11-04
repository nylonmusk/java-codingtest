import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char[][] a = new char[N][M];
        for (int i = 0; i < N; i++) {
            String s = br.readLine().trim();
            for (int j = 0; j < M; j++) {
                a[i][j] = s.charAt(j);
            }
        }
        int answer = 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                for (int k = 1; i + k < N && j + k < M; k++) {
                    if (a[i][j] == a[i + k][j] && a[i][j] == a[i][j + k] && a[i][j] == a[i + k][j + k]) {
                        int area = (k + 1) * (k + 1);
                        if (area > answer) {
                            answer = area;
                        }
                    }
                }
            }
        }
        System.out.println(answer);
    }
}