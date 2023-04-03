import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
        bw.write("23");
        bw.newLine();
        bw.write("2912rla");
        bw.flush();
        bw.close();
    }
}