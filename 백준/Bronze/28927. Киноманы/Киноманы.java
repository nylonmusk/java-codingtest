import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int t1 = Integer.parseInt(st.nextToken());
        int e1 = Integer.parseInt(st.nextToken());
        int f1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int t2 = Integer.parseInt(st.nextToken());
        int e2 = Integer.parseInt(st.nextToken());
        int f2 = Integer.parseInt(st.nextToken());

        int maxTime = t1 * 3 + e1 * 20 + f1 * 120;
        int melTime = t2 * 3 + e2 * 20 + f2 * 120;

        if (maxTime > melTime) {
            System.out.println("Max");
        } else if (melTime > maxTime) {
            System.out.println("Mel");
        } else {
            System.out.println("Draw");
        }
    }
}