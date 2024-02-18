import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().replaceAll(" ", "").replaceAll("\\+", "").replaceAll("=", "").split("");

        System.out.println(Integer.parseInt(s[0]) + Integer.parseInt(s[1]) == Integer.parseInt(s[2]) ? "YES" : "NO");
    }
}
