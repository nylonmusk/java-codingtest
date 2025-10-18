import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String original = br.readLine();
        String rewritten = br.readLine();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (original.charAt(i) != rewritten.charAt(i)) count++;
        }
        System.out.println(count);
    }
}