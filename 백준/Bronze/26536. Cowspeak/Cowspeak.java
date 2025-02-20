import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 테스트 케이스 개수

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                String moo = st.nextToken();
                int mCount = 0, oCount = 0;

                for (char c : moo.toCharArray()) {
                    if (c == 'M') mCount++;
                    else if (c == 'O') oCount++;
                }

                int asciiValue = Integer.parseInt(Integer.toString(mCount, 16) + Integer.toString(oCount, 16), 16);
                answer.append((char) asciiValue);
            }
            answer.append("\n");
        }

        System.out.print(answer);
    }
}