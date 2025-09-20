import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        int r1 = Integer.parseInt(st.nextToken());
        int c1 = Integer.parseInt(st.nextToken());
        int r2 = Integer.parseInt(st.nextToken());
        int c2 = Integer.parseInt(st.nextToken());

        int rows = r2 - r1 + 1;
        int cols = c2 - c1 + 1;
        long[][] arr = new long[rows][cols];
        int maxLength = 0;

        for (int i = 0; i < rows; i++) {
            int r = r1 + i;
            for (int j = 0; j < cols; j++) {
                int c = c1 + j;
                long value = valueAt(r, c);
                arr[i][j] = value;
                int length = Long.toString(value).length();
                if (length > maxLength) maxLength = length;
            }
        }

        StringBuilder answer = new StringBuilder();
        String format = "%" + maxLength + "d";
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                answer.append(String.format(format, arr[i][j]));
                if (j != cols - 1) answer.append(" ");
            }
            if (i != rows - 1) answer.append('\n');
        }

        System.out.print(answer);
    }

    private static long valueAt(int r, int c) {
        int k = Math.max(Math.abs(r), Math.abs(c));
        if (k == 0) return 1L;
        long max = (2L * k + 1) * (2L * k + 1);
        long S;
        if (r == k) {
            S = k - c;
        } else if (c == -k) {
            S = 2L * k + (k - r);
        } else if (r == -k) {
            S = 4L * k + (c + k);
        } else {
            S = 6L * k + (r + k);
        }
        return max - S;
    }
}