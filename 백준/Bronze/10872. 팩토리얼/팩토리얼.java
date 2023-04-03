import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int answer = 1;
        if(n == 0) {
            bw.write(Integer.toString(answer));
        } else {
            for (int i = 1; i <= n; i++) {
                answer *= i;
            }
            bw.write(Integer.toString(answer));
        }        
        bw.flush();
        bw.close();
    }
}