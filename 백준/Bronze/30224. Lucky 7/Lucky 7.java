import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int N = Integer.parseInt(S);
        int answer = -1;
        if (!S.contains("7") && N % 7 != 0) {
            answer = 0;
        } else if (!S.contains("7") && N % 7 == 0) {
            answer = 1;
        } else if (S.contains("7") && N % 7 != 0) {
            answer = 2;
        } else {
            answer = 3;
        }
        System.out.println(answer);
    }
}
