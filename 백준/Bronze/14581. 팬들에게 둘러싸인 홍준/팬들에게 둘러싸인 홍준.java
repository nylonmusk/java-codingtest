import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        answer.append(":fan::fan::fan:").append("\n").append(":fan::").append(br.readLine()).append("::fan:").append("\n").append(":fan::fan::fan:");
        System.out.println(answer);

    }
}
