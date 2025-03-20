import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int totalSheets = 0;
        int currentPage = 1;

        for (int i = 0; i < n; i++) {
            int pages = Integer.parseInt(st.nextToken());

            if (currentPage % 2 == 0) {
                currentPage++;
            }

            currentPage += pages;
            totalSheets += (pages + 1) / 2;
        }

        System.out.println(totalSheets);
    }
}