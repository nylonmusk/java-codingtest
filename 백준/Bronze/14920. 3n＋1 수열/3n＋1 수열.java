import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(br.readLine());
        int answer = 1;

        while (C != 1) {
            if (C % 2 == 0) {
                C /= 2;
            } else {
                C = 3 * C + 1;
            }
            answer++;
        }

        System.out.println(answer);
    }
}