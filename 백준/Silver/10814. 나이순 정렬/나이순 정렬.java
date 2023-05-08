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
        int N = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(br.readLine());
        }
        for (int i = 1; i <= 200; i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).split(" ")[0].equals(String.valueOf(i))) {
                    bw.write(list.get(j));
                    bw.newLine();
                }
            }
        }
        bw.flush();
        bw.close();
    }
}