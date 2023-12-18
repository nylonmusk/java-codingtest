import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] woods = new int[5];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 5; i++) {
            woods[i] = Integer.parseInt(st.nextToken());
        }

        while (true) {
            boolean isSorted = true;
            for (int i = 0; i < 4; i++) {
                if (woods[i] > woods[i + 1]) {
                    int temp = woods[i];
                    woods[i] = woods[i + 1];
                    woods[i + 1] = temp;
                    for (int j = 0; j < 5; j++) {
                        System.out.print(woods[j] + " ");
                    }
                    System.out.println();
                    isSorted = false;
                }
            }

            if (isSorted) break;
        }
    }
}


