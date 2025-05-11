import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int A = 1; A < N; A++) {
            if (A % 2 != 0) continue;
            for (int B = 1; B < N - A; B++) {
                int C = N - A - B;
                if (C <= 0) continue;
                if (C >= B + 2) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}