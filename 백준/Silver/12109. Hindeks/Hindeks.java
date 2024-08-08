import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] citations = new int[N];
        String[] input = br.readLine().split(" ");

        for (int i = 0; i < N; i++) {
            citations[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(citations);

        int hIndex = 0;

        for (int i = 0; i < N; i++) {
            if (citations[N - 1 - i] >= i + 1) {
                hIndex = i + 1;
            } else {
                break;
            }
        }

        System.out.println(hIndex);
    }
}