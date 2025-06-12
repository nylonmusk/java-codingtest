import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int d_s = Integer.parseInt(st.nextToken());
        int y_s = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int d_m = Integer.parseInt(st.nextToken());
        int y_m = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= 5000; i++) {
            if ((i + d_s) % y_s == 0 && (i + d_m) % y_m == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}