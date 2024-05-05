import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] files = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            files[i] = Integer.parseInt(st.nextToken());
        }
        int clusterSize = Integer.parseInt(br.readLine());

        long diskSpace = 0;
        for (int fileSize : files) {
            diskSpace += (long) Math.ceil((double) fileSize / clusterSize) * clusterSize;
        }
        System.out.println(diskSpace);
    }
}
