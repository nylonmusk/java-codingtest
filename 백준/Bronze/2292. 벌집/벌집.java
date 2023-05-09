import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int i = 1;
        if (N == 1) {
            bw.write(String.valueOf(i));
        } else {
            while (N > 1) {
                N -= 6 * i;
                if (N > 1) {
                    i++;
                }
            }
            bw.write(String.valueOf(i + 1));
        }

        bw.flush();
    }
}