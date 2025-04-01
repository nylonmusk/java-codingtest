import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int time = 0;
        int k = 1;

        while (N > 0) {
            if (N < k) {
                k = 1;
            }
            N -= k;
            k++;
            time++;
        }

        System.out.println(time);
    }
}