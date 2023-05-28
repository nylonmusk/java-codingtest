import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] sangkeun = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            sangkeun[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(sangkeun);
        int M = Integer.parseInt(br.readLine());
        int[] card = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            card[i] = Integer.parseInt(st.nextToken());
        }

        for (int j = 0; j < M; j++) {
            int count = countDuplicates(sangkeun, card[j]);
            sb.append(count).append(" ");
        }

        System.out.println(sb);
    }

    private static int countDuplicates(int[] arr, int target) {
        int start = findStartIndex(arr, target);
        int end = findEndIndex(arr, target);
        if (start == -1 || end == -1) {
            return 0;
        }
        return end - start + 1;
    }

    private static int findStartIndex(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int result = -1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] >= target) {
                end = mid - 1;
                if (arr[mid] == target) {
                    result = mid;
                }
            } else {
                start = mid + 1;
            }
        }

        return result;
    }

    private static int findEndIndex(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int result = -1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] <= target) {
                start = mid + 1;
                if (arr[mid] == target) {
                    result = mid;
                }
            } else {
                end = mid - 1;
            }
        }

        return result;
    }
}
