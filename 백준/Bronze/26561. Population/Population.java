import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            int p = Integer.parseInt(input[0]);
            int t = Integer.parseInt(input[1]);

            int births = t / 4;
            int deaths = t / 7;

            int netChange = births - deaths;
            
            System.out.println(p + netChange);
        }
    }
}
