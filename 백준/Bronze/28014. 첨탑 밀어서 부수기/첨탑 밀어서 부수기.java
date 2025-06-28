import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] towers = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            towers[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        int i = 0;

        while (i < N) {
            count++;
            int curr = towers[i];
            i++;

            while (i < N && towers[i] < curr) {
                curr = towers[i];
                i++;
            }
        }

        System.out.println(count);
    }
}