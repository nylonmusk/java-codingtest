import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int caseNum = 1;
        while ((line = br.readLine()) != null) {
            long s = Long.parseLong(line);
            if (s == 0) break;

            long compressed = (s + 1) / 2;

            long encoded = (compressed * 3 + 1) / 2;

            long lines = (encoded + 61) / 62;
            long numFiles = (lines + 29999) / 30000;

            System.out.println("File #" + caseNum);
            System.out.println("John needs " + numFiles + " floppies.\n");

            caseNum++;
        }
    }
}