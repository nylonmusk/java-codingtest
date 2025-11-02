import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] S = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            S[i] = Integer.parseInt(st.nextToken());
        }

        int[] count = new int[10];
        int distinct = 0;
        int left = 0;
        int answer = 0;

        for (int right = 0; right < N; right++) {
            if (count[S[right]] == 0) distinct++;
            count[S[right]]++;

            while (distinct > 2) {
                count[S[left]]--;
                if (count[S[left]] == 0) distinct--;
                left++;
            }

            answer = Math.max(answer, right - left + 1);
        }

        System.out.println(answer);
    }
}