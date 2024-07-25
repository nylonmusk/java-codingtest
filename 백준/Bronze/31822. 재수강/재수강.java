import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().substring(0, 5);
        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        while (N-- > 0) {
            if (br.readLine().startsWith(s)) answer++;
        }

        System.out.println(answer);

    }
}