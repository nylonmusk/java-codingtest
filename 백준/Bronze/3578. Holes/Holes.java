import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int h = Integer.parseInt(br.readLine());

        if (h == 0) {
            System.out.println(1);
        } else if (h == 1) {
            System.out.println(0);
        } else {
            StringBuilder answer = new StringBuilder();
            if (h % 2 == 1) {
                answer.append(4);
                h -= 1;
            }
            while (h > 0) {
                answer.append(8);
                h -= 2;
            }
            System.out.println(answer);
        }
    }
}