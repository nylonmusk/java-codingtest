import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n / 5; i++) {
            sb.append("V");
        }
        for (int i = 0; i < n % 5; i++) {
            sb.append("I");
        }
        System.out.println(sb);
    }
}
