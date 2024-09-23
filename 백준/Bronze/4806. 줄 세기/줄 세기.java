import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long answer = 0;
        String s = null;
        while ((s = br.readLine()) != null) {
            answer++;
        }
        System.out.println(answer);
    }
}