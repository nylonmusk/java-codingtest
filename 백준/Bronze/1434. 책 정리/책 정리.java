import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] boxes = new int[n];
        int[] books = new int[m];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            boxes[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            books[i] = Integer.parseInt(st.nextToken());
        }

        int bookIdx = 0;
        for (int i = 0; i < n && bookIdx < m; i++) {
            int used = 0;
            while (bookIdx < m && used + books[bookIdx] <= boxes[i]) {
                used += books[bookIdx];
                bookIdx++;
            }
            boxes[i] -= used;
        }

        int waste = 0;
        for (int i = 0; i < n; i++) {
            waste += boxes[i];
        }

        System.out.println(waste);
    }
}