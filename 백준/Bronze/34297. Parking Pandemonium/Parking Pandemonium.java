import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        br.readLine();
        int C = Integer.parseInt(br.readLine());
        System.out.println(M * C);
    }
}