import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] socks = new int[10];

        for (int i = 0; i < 5; i++) {
            int sock = Integer.parseInt(br.readLine());
            socks[sock]++;
        }

        for (int i = 0; i <= 9; i++) {
            if (socks[i] % 2 != 0) System.out.println(i);
        }
    }
}