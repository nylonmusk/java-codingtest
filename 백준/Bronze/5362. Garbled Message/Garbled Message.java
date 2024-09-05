import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            line = line.replaceAll("iiing", "th");
            line = line.replaceAll("Siiiing", "Sith");

            answer.append(line).append("\n");
        }
        System.out.println(answer);
    }
}