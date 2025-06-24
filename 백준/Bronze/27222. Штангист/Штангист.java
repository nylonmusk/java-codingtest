import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] training = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            training[i] = Integer.parseInt(st.nextToken());
        }

        int totalGain = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int morning = Integer.parseInt(st.nextToken());
            int evening = Integer.parseInt(st.nextToken());

            if (training[i] == 1 && evening > morning) {
                totalGain += (evening - morning);
            }
        }

        System.out.println(totalGain);
    }
}