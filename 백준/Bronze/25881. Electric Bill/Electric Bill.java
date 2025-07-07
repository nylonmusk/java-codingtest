import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int rate1 = Integer.parseInt(st.nextToken());
        int rate2 = Integer.parseInt(st.nextToken());

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int usage = Integer.parseInt(br.readLine());
            int cost;
            if (usage <= 1000) {
                cost = usage * rate1;
            } else {
                cost = 1000 * rate1 + (usage - 1000) * rate2;
            }
            System.out.println(usage + " " + cost);
        }
    }
}