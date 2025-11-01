import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        
        int[][] a = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        int[][] cells = new int[n * n][3];
        int idx = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cells[idx][0] = i;
                cells[idx][1] = j;
                cells[idx][2] = a[i][j];
                idx++;
            }
        }
        Arrays.sort(cells, Comparator.comparingInt(x -> x[2]));
        
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], 1);
        }
        
        int[] dr = {-1,1,0,0};
        int[] dc = {0,0,-1,1};
        
        for (int[] cell : cells) {
            int r = cell[0], c = cell[1];
            for (int k = 0; k < 4; k++) {
                int nr = r + dr[k], nc = c + dc[k];
                if (nr >= 0 && nr < n && nc >= 0 && nc < n && a[nr][nc] > a[r][c]) {
                    if (dp[nr][nc] < dp[r][c] + 1) dp[nr][nc] = dp[r][c] + 1;
                }
            }
        }
        
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (dp[i][j] > ans) ans = dp[i][j];
            }
        }
        
        System.out.println(ans);
    }
}