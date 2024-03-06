import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] plannedPages = new int[n];
        int[] actualPages = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            plannedPages[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            actualPages[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (actualPages[i] >= plannedPages[i]) {
                count++;
            }
        }

        System.out.println(count);
    }
}
