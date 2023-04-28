import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] st = br.readLine().split(" ");
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
     
        sb1.append(st[0].charAt(2));
        sb1.append(st[0].charAt(1));
        sb1.append(st[0].charAt(0));
        
        sb2.append(st[1].charAt(2));
        sb2.append(st[1].charAt(1));
        sb2.append(st[1].charAt(0));

        bw.write(String.valueOf(Math.max(Integer.parseInt(sb1.toString()),Integer.parseInt(sb2.toString()))));
        bw.flush();
        bw.close();
    }
}