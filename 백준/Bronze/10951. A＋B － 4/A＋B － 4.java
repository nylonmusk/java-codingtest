import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String line;
        while ((line = br.readLine()) != null) {
            st = new StringTokenizer(line);
            String a = st.nextToken();
            String b = st.nextToken();
            int sum = Integer.parseInt(a) + Integer.parseInt(b);
            bw.write(Integer.toString(sum));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
