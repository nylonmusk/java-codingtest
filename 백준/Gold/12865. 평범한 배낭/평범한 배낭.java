//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.StringTokenizer;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int N = Integer.parseInt(st.nextToken());
//        int K = Integer.parseInt(st.nextToken());
//        Map<Integer, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < N; i++) {
//            StringTokenizer st2 = new StringTokenizer(br.readLine());
//            int key = Integer.parseInt(st2.nextToken());
//            int value = Integer.parseInt(st2.nextToken());
//            if (key <= K) {
//                map.put(key, value);
//            }
//        }
//
//        Object[] keys = map.keySet().toArray();
//        Arrays.sort(keys);
//
//        int max = Integer.MIN_VALUE;
//        int sumKey = 0;
//        int sumValue = 0;
//        int i = 0;
//
//        while (i <= map.size() - 1) {
//            sumKey += (Integer) keys[i];
//            sumValue += map.get(keys[i]);
//            if (i < keys.length - 1) {
//                if (sumKey + (Integer) keys[i + 1] <= K) {
//                    i++;
//                    continue;
//                }
//            }
//            max = Integer.max(max, sumValue);
//            sumKey = 0;
//            sumValue = 0;
//            i++;
//        }
//        bw.write(String.valueOf(max));
//        bw.flush();
//        bw.close();
//    }
//}
//
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, K;
    static int[] weights, values;
    static int[][] dp;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        weights = new int[N];
        values = new int[N];
        dp = new int[N + 1][K + 1];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            weights[i] = Integer.parseInt(st.nextToken());
            values[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= K; j++) {
                if (weights[i - 1] > j) {
                    // 현재 물건의 무게가 배낭의 무게보다 크면 이전 아이템의 값을 그대로 가져옴
                    dp[i][j] = dp[i - 1][j];
                } else {
                    // 현재 물건의 무게가 배낭의 무게보다 작거나 같으면 이전 아이템의 값과 현재 아이템의 값을 더한 값 중 최대값 저장
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weights[i - 1]] + values[i - 1]);
                }
            }
        }

        System.out.println(dp[N][K]);
    }
}
