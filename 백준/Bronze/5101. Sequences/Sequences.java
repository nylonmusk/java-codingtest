import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while (!(line = br.readLine()).equals("0 0 0")) {
            StringTokenizer st = new StringTokenizer(line);
            int start = Integer.parseInt(st.nextToken());
            int difference = Integer.parseInt(st.nextToken());
            int value = Integer.parseInt(st.nextToken());

            int n = (value - start) / difference + 1;

            if ((value - start) % difference == 0 && n > 0) {
                System.out.println(n);
            } else {
                System.out.println("X");
            }
        }
    }
}