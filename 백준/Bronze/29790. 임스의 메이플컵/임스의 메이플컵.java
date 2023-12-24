import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int U = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        if (N < 1000) {
            System.out.println("Bad");
        } else if (N >= 1000) {
            if (U >= 8000 | L >= 260) {
                System.out.println("Very Good");
            } else {
                System.out.println("Good");
            }
        }
    }
}