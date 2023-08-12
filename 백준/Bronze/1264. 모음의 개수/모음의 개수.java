import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        while (true) {
            String s = br.readLine().toUpperCase().replaceAll("A", "@").replaceAll("E", "@").replaceAll("I", "@").replaceAll("O", "@").replaceAll("U", "@");
            if (s.equals("#")) break;


            int count = 0;
            for (char c : s.toCharArray()) {
                if (c == '@') count++;
            }
            answer.append(count).append("\n");
        }
        System.out.println(answer);
    }
}
