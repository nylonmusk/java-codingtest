import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        String S = st.nextToken();

        int deletedCount = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String itemName = st.nextToken();
            int quantity = Integer.parseInt(st.nextToken());

            String[] words = itemName.split("_");

            for (String word : words) {
                if (word.equals(S)) {
                    deletedCount += quantity;
                    break;
                }
            }
        }

        System.out.println(deletedCount);
    }
}