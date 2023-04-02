import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if(i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                    bw.write("1");    
        }else {
                    bw.write("0");            
        }
        bw.flush();
        bw.close();

    }
}