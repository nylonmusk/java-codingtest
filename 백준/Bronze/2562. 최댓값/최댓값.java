import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[9];
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, arr[i]);
        }
        
        for (int i = 0; i < 9; i++) {
            if (arr[i] == max) {
                index = i;
            }
        }
        
        bw.write(Integer.toString(max));
        bw.newLine();
        bw.write(Integer.toString(index + 1));
        bw.flush();
        bw.close();
    }
}