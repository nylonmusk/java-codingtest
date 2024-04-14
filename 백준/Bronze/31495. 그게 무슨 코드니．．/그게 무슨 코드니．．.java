import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String answer = "";

        if (str.startsWith("\"") && str.endsWith("\"") && str.length() >= 3) {
            answer = str.substring(1, str.length() - 1);
        } else {
            answer = "CE";
        }

        System.out.println(answer);
    }
}
