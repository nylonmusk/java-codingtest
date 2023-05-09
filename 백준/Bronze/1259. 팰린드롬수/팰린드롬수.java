import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line;
        while (!(line = br.readLine()).equals("0")) {
            int i = 0;
            int j = line.length() - 1;
            boolean b = false;
            while (i < j) {
                if (line.charAt(i) == line.charAt(j)) {
                    i++;
                    j--;
                    continue;
                } else {
                    b = true;
                    break;
                }
            }
            if (b) {
                bw.write("no");
            } else {
                bw.write("yes");
            }
            bw.newLine();
        }
        bw.flush();
    }
}