import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int n = Integer.parseInt(br.readLine());

        int answer = 0;
        for (int i = 0 ; i < n ; i++) {
            String ring = br.readLine();
            if ((ring + ring).contains(s)) answer++;
        }
        System.out.println(answer);
    }
}
