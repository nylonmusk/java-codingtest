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
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int num = 0;
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= n; i++) {
            num = Integer.parseInt(st.nextToken());;
            if(x > num) {
                bw.write(Integer.toString(num));  
                    if(n == i) {
                        break;
                    }
                bw.write(" ");
            } 
        }
        bw.flush();
        bw.close();
    }
}