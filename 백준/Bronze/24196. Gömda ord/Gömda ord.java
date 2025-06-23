import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        StringBuilder sb = new StringBuilder();

        int idx = 0;
        while (idx < input.length()) {
            char current = input.charAt(idx);
            sb.append(current);

            if (idx == input.length() - 1) break;

            int step = current - 'A' + 1;
            idx += step;
        }

        System.out.println(sb.toString());
    }
}