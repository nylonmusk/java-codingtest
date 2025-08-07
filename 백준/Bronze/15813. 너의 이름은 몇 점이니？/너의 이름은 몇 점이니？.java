import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int len = Integer.parseInt(br.readLine());
        String name = br.readLine();

        int score = 0;
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            score += ch - 'A' + 1;
        }

        System.out.println(score);
    }
}