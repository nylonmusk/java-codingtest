import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Kcpc implements Comparable<Kcpc> {
    int id;
    int[] score;
    int submitCount;
    int lastSubmitTime;

    Kcpc(int id, int k) {
        this.id = id;
        this.score = new int[k + 1];
        this.submitCount = 0;
        this.lastSubmitTime = 0;
    }

    @Override
    public int compareTo(Kcpc k) {
        int sum1 = Arrays.stream(this.score).sum();
        int sum2 = Arrays.stream(k.score).sum();

        if (sum1 != sum2) {
            return sum2 - sum1;
        }
        if (this.submitCount != k.submitCount) {
            return this.submitCount - k.submitCount;
        }
        return this.lastSubmitTime - k.lastSubmitTime;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();

        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            Kcpc[] kcpc = new Kcpc[n + 1];

            for (int i = 1; i <= n; i++) {
                kcpc[i] = new Kcpc(i, k);
            }

            for (int z = 0; z < m; z++) {
                st = new StringTokenizer(br.readLine());
                int i = Integer.parseInt(st.nextToken());
                int j = Integer.parseInt(st.nextToken());
                int s = Integer.parseInt(st.nextToken());

                kcpc[i].submitCount++;
                kcpc[i].lastSubmitTime = z;
                kcpc[i].score[j] = Math.max(kcpc[i].score[j], s);
            }

            Arrays.sort(kcpc, 1, n + 1);

            int rank = 1;
            for (int i = 1; i <= n; i++) {
                if (kcpc[i].id == t) break;
                rank++;
            }
            answer.append(rank).append("\n");
        }
        System.out.println(answer);
    }
}
