import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        int totalQuota = k + 60;
        int answer;

        if (n <= totalQuota) {
            answer = n * 1500;
        } else {
            answer = totalQuota * 1500 + (n - totalQuota) * 3000;
        }

        System.out.println(answer);
    }
}
