import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = 0;
        while (n-- > 0) {
            int d = Integer.parseInt(br.readLine());
            if (d % 2 == 1) answer ++;
        }

        System.out.println(answer);
    }
}
