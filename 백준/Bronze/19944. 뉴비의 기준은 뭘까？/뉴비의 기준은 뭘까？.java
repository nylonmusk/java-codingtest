import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String answer = "";
        if (M == 1 || M == 2) {
            answer = "NEWBIE!";
        } else {
            if (N >= M) {
                answer = "OLDBIE!";
            } else {
                answer = "TLE!";
            }
        }
        System.out.println(answer);
    }
}