import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());

        List<Integer> bestSeq = new ArrayList<>();
        for (int second = 1; second <= N; second++) {
            List<Integer> seq = new ArrayList<>();
            seq.add(N);
            seq.add(second);

            while (true) {
                int next = seq.get(seq.size() - 2) - seq.get(seq.size() - 1);
                if (next < 0) break;
                seq.add(next);
            }

            if (seq.size() > bestSeq.size()) {
                bestSeq = seq;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(bestSeq.size()).append('\n');
        for (int i = 0; i < bestSeq.size(); i++) {
            if (i > 0) sb.append(' ');
            sb.append(bestSeq.get(i));
        }
        System.out.println(sb);
    }
}