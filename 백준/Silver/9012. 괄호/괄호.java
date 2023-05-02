import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split("");
            for (int j = 0; j < str.length; j++) {
                if (str[j].equals("(")) {
                    count++;
                }

                if (str[j].equals(")")) {
                    count--;
                }
                if (count < 0) {
                    break;
                }
            }
            if (count == 0) {
                bw.write("YES");
                bw.newLine();
            }
            if (count != 0) {
                bw.write("NO");
                bw.newLine();
            }
            count = 0;
        }
        bw.flush();
        bw.close();
    }
}