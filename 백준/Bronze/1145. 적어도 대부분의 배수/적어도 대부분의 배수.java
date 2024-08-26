import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; ; i++) {
            int count = 0;
            for (int j = 0; j < 5; j++) {
                if (i % numbers[j] == 0) {
                    count++;
                }
            }
            if (count >= 3) {
                System.out.println(i);
                break;
            }
        }
    }
}