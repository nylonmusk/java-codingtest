import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        final int OFFSET = 1_000_000;
        final int SIZE = 2_000_001;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] count = new int[SIZE];

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            count[num + OFFSET]++;
        }

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < SIZE; i++) {
            while (count[i]-- > 0) {
                answer.append(i - OFFSET).append('\n');
            }
        }

        System.out.print(answer);
    }
}