import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();

        while (true) {
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);

            int b = Integer.parseInt(st.nextToken());
            if (b == 0) break;

            String p = st.nextToken();
            String m = st.nextToken();

            BigInteger pDecimal = new BigInteger(p, b);
            BigInteger mDecimal = new BigInteger(m, b);

            BigInteger remainder = pDecimal.mod(mDecimal);

            answer.append(remainder.toString(b)).append("\n");
        }

        System.out.print(answer.toString());
    }
}