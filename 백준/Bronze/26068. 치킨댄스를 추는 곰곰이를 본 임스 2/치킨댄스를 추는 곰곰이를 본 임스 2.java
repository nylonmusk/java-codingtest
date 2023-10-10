import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        while (N-- > 0) {
            String gifticon = br.readLine().replace("D-", "");
            if (Integer.parseInt(gifticon) <= 90) answer++;
        }
        System.out.println(answer);
    }
}
