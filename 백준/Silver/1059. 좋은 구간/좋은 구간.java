import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine().trim());

        List<Integer> S = new ArrayList<>();
        while (S.size() < L) {
            String line = br.readLine();
            if (line == null) break;
            StringTokenizer st = new StringTokenizer(line);
            while (st.hasMoreTokens() && S.size() < L) {
                S.add(Integer.parseInt(st.nextToken()));
            }
        }

        int n = Integer.parseInt(br.readLine().trim());

        for (int x : S) {
            if (x == n) {
                System.out.println(0);
                return;
            }
        }

        Collections.sort(S);

        int left = 0;
        int right = Integer.MAX_VALUE;

        for (int x : S) {
            if (x < n) left = x;
            if (x > n) {
                right = x;
                break;
            }
        }

        long leftChoices = n - left;
        long rightChoices = right - n;
        long result = leftChoices * rightChoices - 1;

        System.out.println(result);
    }
}