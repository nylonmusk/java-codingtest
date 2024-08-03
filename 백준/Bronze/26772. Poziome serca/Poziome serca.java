import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] heartLines = {
                " @@@   @@@ ",
                "@   @ @   @",
                "@    @    @",
                "@         @",
                " @       @ ",
                "  @     @  ",
                "   @   @   ",
                "    @ @    ",
                "     @     "
        };

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine().trim());

        for (String line : heartLines) {
            StringBuilder answer = new StringBuilder();
            for (int i = 0; i < n; i++) {
                if (i > 0) {
                    answer.append(" ");
                }
                answer.append(line);
            }
            System.out.println(answer);
        }
    }
}