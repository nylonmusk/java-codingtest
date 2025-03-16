import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            String[] input = br.readLine().split(" ");
            int Smax = Integer.parseInt(input[0]);
            String audience = input[1];

            int standing = 0;
            int needs = 0;

            for (int i = 0; i <= Smax; i++) {
                int count = audience.charAt(i) - '0';
                if (count > 0 && standing < i) {
                    needs += (i - standing);
                    standing = i;
                }
                standing += count;
            }

            System.out.println("Case #" + t + ": " + needs);
        }
    }
}