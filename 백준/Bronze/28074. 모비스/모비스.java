import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine()
                .replaceFirst("M", "@")
                .replaceFirst("O", "@")
                .replaceFirst("B", "@")
                .replaceFirst("I", "@")
                .replaceFirst("S", "@");
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '@') count++;
        }
        System.out.println(count == 5 ? "YES" : "NO");
    }
}
