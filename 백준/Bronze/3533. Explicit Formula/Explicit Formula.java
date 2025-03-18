import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] x = new int[10];
        for (int i = 0; i < 10; i++) {
            x[i] = Integer.parseInt(st.nextToken());
        }

        int answer = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                answer ^= (x[i] | x[j]);
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                for (int k = j + 1; k < 10; k++) {
                    answer ^= (x[i] | x[j] | x[k]);
                }
            }
        }

        System.out.println(answer);
    }
}