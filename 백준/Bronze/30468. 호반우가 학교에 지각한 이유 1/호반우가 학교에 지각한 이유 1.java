import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int str = Integer.parseInt(st.nextToken());
        int dex = Integer.parseInt(st.nextToken());
        int intel = Integer.parseInt(st.nextToken());
        int luk = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int sum = str + dex + intel + luk;
        int count = 0;

        while ((sum / 4.0) < n) {
            sum++;
            count++;
        }

        System.out.println(count);
    }
}