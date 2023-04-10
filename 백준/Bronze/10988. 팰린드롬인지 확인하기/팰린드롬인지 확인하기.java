import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String input = br.readLine();
        String answer = "1";
        int j = input.length() - 1;
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(j)) {
                answer = "0";
                break;
            } 
            j--;
        }
        bw.write(answer);
        bw.flush();
        bw.close();
    }
}