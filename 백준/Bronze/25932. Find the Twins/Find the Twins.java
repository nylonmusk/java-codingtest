import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            System.out.println(line);

            StringTokenizer st = new StringTokenizer(line);
            boolean hasMack = false;
            boolean hasZack = false;

            while (st.hasMoreTokens()) {
                int num = Integer.parseInt(st.nextToken());
                if (num == 18) hasMack = true;
                else if (num == 17) hasZack = true;
            }

            if (hasMack && hasZack) {
                System.out.println("both");
            } else if (hasMack) {
                System.out.println("mack");
            } else if (hasZack) {
                System.out.println("zack");
            } else {
                System.out.println("none");
            }

            System.out.println();
        }
    }
}