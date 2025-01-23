import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        int caseNumber = 1;

        while (true) {
            String line = br.readLine();
            if (line.equals("# #")) break;

            String[] letters = line.split(" ");
            char first = letters[0].charAt(0);
            char second = letters[1].charAt(0);

            int n = Integer.parseInt(br.readLine());
            answer.append("Case ").append(caseNumber++).append("\n");

            for (int i = 0; i < n; i++) {
                String text = br.readLine();
                text = text.replace(first, '_').replace(Character.toUpperCase(first), '_');
                text = text.replace(second, '_').replace(Character.toUpperCase(second), '_');
                answer.append(text).append("\n");
            }
            answer.append("\n");
        }

        System.out.print(answer);
    }
}