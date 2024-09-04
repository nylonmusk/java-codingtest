import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s;
        int answer = 0;

        while ((s = br.readLine()) != null) {
            String replaced = s.replaceAll("joke", "");
            answer += (s.length() - replaced.length()) / 4;
        }
        System.out.println(answer);
    }
}