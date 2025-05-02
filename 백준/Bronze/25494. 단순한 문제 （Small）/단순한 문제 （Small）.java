import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            int count = 0;

            for (int x = 1; x <= a; x++) {
                for (int y = 1; y <= b; y++) {
                    for (int z = 1; z <= c; z++) {
                        int mod1 = x % y;
                        int mod2 = y % z;
                        int mod3 = z % x;

                        if (mod1 == mod2 && mod2 == mod3) {
                            count++;
                        }
                    }
                }
            }

            System.out.println(count);
        }
    }
}