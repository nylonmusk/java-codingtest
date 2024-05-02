import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int V = Integer.parseInt(br.readLine());

        int A = 0;
        int B = 0;
        for (char c : br.readLine().toCharArray()) {
            if (c == 'A') A++;
            if (c == 'B') B++;
        }

        System.out.println(A > B ? "A" : A == B ? "Tie" : "B");
    }
}