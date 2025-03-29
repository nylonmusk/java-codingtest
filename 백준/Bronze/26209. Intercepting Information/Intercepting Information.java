import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        boolean hasNine = false;
        for (int i = 0; i < 8; i++) {
            if (st.nextToken().equals("9")) {
                hasNine = true;
                break;
            }
        }

        System.out.println(hasNine ? "F" : "S");
    }
}