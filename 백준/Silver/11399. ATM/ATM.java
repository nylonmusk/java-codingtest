import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for (String s : br.readLine().split(" ")) {
            list.add(Integer.parseInt(s));
        }

        Collections.sort(list);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                sum += list.get(j);
            }
        }

        bw.write(String.valueOf(sum));
        bw.flush();
    }
}