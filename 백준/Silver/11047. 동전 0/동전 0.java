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
        int N = Integer.parseInt(temp.split(" ")[0]);
        int K = Integer.parseInt(temp.split(" ")[1]);
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        int i = N - 1;
        while (K > 0) {
            if (K - list.get(i) >= 0) {
                sum++;
                K -= list.get(i);
            } else {
                i--;
            }
        }
        bw.write(String.valueOf(sum));
        bw.flush();
    }
}