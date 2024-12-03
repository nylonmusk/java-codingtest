import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        String line;

        while (!(line = br.readLine()).equals("0")) {
            int n = Integer.parseInt(line);
            int sum = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                int price = Integer.parseInt(st.nextToken());
                if (sum + price <= 300) {
                    sum += price;
                }
            }

            answer.append(sum).append("\n");
        }

        System.out.print(answer);
    }
}