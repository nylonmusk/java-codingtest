import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        long sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += Math.pow(Long.parseLong(st.nextToken()), 2);
        }
        
        bw.write(Long.toString(sum % 10));
        bw.flush();
        bw.close();
    }
}