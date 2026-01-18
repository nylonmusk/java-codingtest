import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        
        long r = A % B;
        int result = 0;
        
        for (int i = 0; i < N; i++) {
            r *= 10;
            result = (int)(r / B);
            r %= B;
        }
        
        System.out.println(result);
    }
}