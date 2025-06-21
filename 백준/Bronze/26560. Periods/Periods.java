import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String line = br.readLine();

            if (line.endsWith(".")) {
                System.out.println(line);
            } else {
                System.out.println(line + ".");
            }
        }
    }
}