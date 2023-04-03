import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        String answer = "";
        if(a > 0 && b > 0) answer = "1";
        if(a < 0 && b > 0) answer = "2";
        if(a < 0 && b < 0) answer = "3";
        if(a > 0 && b < 0) answer = "4";
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(answer);
        bw.flush();
        bw.close();
    }
}