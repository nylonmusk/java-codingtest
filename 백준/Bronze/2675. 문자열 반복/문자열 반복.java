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
        
        int n = Integer.parseInt(br.readLine());
        String s;
        int repeat;
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            repeat = Integer.parseInt(st.nextToken());
            s = st.nextToken();
            for (int k = 0; k < s.length(); k++) {
                for (int j = 0; j < repeat; j++) {
                    bw.write(String.valueOf(s.charAt(k)));
                }
            }
            if (i != n - 1) {
                bw.newLine();                
            }
        }
        bw.flush();
        bw.close();
    }
}