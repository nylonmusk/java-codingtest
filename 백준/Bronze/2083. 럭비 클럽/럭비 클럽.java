import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        while (true) {
            String s = br.readLine();
            if (s.startsWith("#")) break;

            String name = s.split(" ")[0];
            int age = Integer.parseInt(s.split(" ")[1]);
            int weight = Integer.parseInt(s.split(" ")[2]);
            answer.append(name).append(" ");
            answer.append(age > 17 || weight >= 80 ? "Senior" : "Junior");
            answer.append("\n");
        }
        System.out.println(answer);
    }
}