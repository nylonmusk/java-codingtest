import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int Z = Integer.parseInt(br.readLine());

        for (int i = 0; i < Z; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int W = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            int maxTourists = (W * K) / 2;
            System.out.println(maxTourists);
        }
    }
}