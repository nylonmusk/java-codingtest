import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int L = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] participants = new int[5];
        for (int i = 0; i < 5; i++) {
            participants[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(participants[i] - (L * P) + " ");
        }
    }
}
