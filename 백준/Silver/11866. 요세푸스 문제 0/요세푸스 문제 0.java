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
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        int N = Integer.parseInt(temp.split(" ")[0]);
        int K = Integer.parseInt(temp.split(" ")[1]);

        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        int index = K - 1;
        while (!list.isEmpty()) {
            while (index >= list.size()) {
                index = index - list.size();
            }
            sb.append(list.get(index));
            list.remove(index);
            if (!list.isEmpty()) {
                sb.append(", ");
            } else {
                sb.append(">");
            }
            index += K - 1;
        }

        bw.write(sb.toString());
        bw.flush();
    }
}