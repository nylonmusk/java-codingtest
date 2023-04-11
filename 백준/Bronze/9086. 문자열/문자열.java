import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String s;
        for (int i = 0; i < n; i++) {
            s = br.readLine();
            bw.write(String.valueOf(s.charAt(0)) + String.valueOf(s.charAt(s.length() - 1)));
            if (i != n - 1) {
                bw.newLine();                
            }
        }
        bw.flush();
        bw.close();
    }
}