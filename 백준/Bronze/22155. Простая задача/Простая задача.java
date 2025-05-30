import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int branch = Integer.parseInt(st.nextToken());
            int loop = Integer.parseInt(st.nextToken()); 

            if ((branch <= 1 && loop <= 2) || (branch <= 2 && loop <= 1)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}