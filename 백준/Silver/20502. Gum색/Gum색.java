import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] ranks = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            ranks[i] = Integer.parseInt(st.nextToken());
        }

        List<Integer>[] keywordPosts = new List[M + 1];
        for (int i = 1; i <= M; i++) {
            keywordPosts[i] = new ArrayList<>();
        }

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int keywordCount = Integer.parseInt(st.nextToken());
            for (int j = 0; j < keywordCount; j++) {
                int keyword = Integer.parseInt(st.nextToken());
                keywordPosts[keyword].add(i);
            }
        }

        int Q = Integer.parseInt(br.readLine());
        for (int i = 0; i < Q; i++) {
            int query = Integer.parseInt(br.readLine());
            List<Integer> posts = keywordPosts[query];
            if (posts.isEmpty()) {
                System.out.println("-1");
            } else {
                posts.sort(Comparator.comparingInt(o -> ranks[o]));
                for (int post : posts) {
                    System.out.print((post + 1) + " ");
                }
                System.out.println();
            }
        }
    }
}