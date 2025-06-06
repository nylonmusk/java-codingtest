import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] T = new int[3];
            boolean solved = false;

            for (int j = 0; j < 3; j++) {
                T[j] = Integer.parseInt(st.nextToken());
                if (T[j] != -1) solved = true;
            }

            if (!solved) continue;

            boolean valid = true;

            for (int j = 0; j < 3; j++) {
                if (T[j] == -1) continue;
                int currentTime = T[j];

                for (int k = 0; k < j; k++) {
                    if (T[k] == -1 || T[k] > currentTime) {
                        valid = false;
                        break;
                    }
                }

                for (int k = j + 1; k < 3; k++) {
                    if (T[k] != -1 && T[k] < currentTime) {
                        valid = false;
                        break;
                    }
                }
                if (!valid) break;
            }

            if (valid) count++;
        }

        System.out.println(count);
    }
}