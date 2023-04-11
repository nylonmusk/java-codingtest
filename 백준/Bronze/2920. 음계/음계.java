import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        str = str.replaceAll(" ", "");
        String descending = "87654321";
        String ascending = "12345678";
        if (str.equals(descending)) {
            bw.write("descending");            
        } else if (str.equals(ascending)) {
            bw.write("ascending");            
        } else {
            bw.write("mixed");            
        }
         
        bw.flush();
        bw.close();
    }
}