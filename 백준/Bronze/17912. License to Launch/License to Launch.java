import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int minJunk = Integer.MAX_VALUE;
        int answer = 0;

        for (int i = 0; i < n; i++) {
            int junk = Integer.parseInt(st.nextToken());

            if (junk < minJunk) {
                minJunk = junk;
                answer = i;
            }
        }

        System.out.println(answer);
    }
}