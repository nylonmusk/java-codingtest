import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String temp = br.readLine();
        List<Integer> list = new ArrayList<>();
        int N = Integer.parseInt(temp.split(" ")[0]);
        int K = Integer.parseInt(temp.split(" ")[1]);

        int mulN = 1;
        for (int i = 1; i <= N; i++) {
            mulN *= i;
        }

        int mulK = 1;
        for (int i = 1; i <= K; i++) {
            mulK *= i;
        }

        int mulNK = 1;
        for (int i = 1; i <= N - K; i++) {
            mulK *= i;
        }

        bw.write(String.valueOf(mulN / mulK * mulNK));
        bw.flush();
    }
}