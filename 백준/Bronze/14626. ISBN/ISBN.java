import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String isbn = br.readLine();
        int missingIdx = -1;
        int total = 0;

        for (int i = 0; i < 13; i++) {
            char ch = isbn.charAt(i);
            int weight = (i % 2 == 0) ? 1 : 3;

            if (ch == '*') {
                missingIdx = i;
                continue;
            }

            total += (ch - '0') * weight;
        }

        for (int x = 0; x <= 9; x++) {
            int weight = (missingIdx % 2 == 0) ? 1 : 3;
            int sum = total + x * weight;
            if (sum % 10 == 0) {
                System.out.println(x);
                return;
            }
        }
    }
}