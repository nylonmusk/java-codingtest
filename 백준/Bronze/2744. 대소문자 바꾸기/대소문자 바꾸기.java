import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        for (int i = 0; i < s.length(); i++) {
            if (65 <= s.charAt(i) && s.charAt(i) <= 90) {
                sb.append(String.valueOf(s.charAt(i)).toLowerCase());
            }
            if (97 <= s.charAt(i) && s.charAt(i) <= 122) {
                sb.append(String.valueOf(s.charAt(i)).toUpperCase());
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}