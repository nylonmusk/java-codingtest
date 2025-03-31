import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();
        String B = br.readLine();
        StringBuilder answer = new StringBuilder();
        answer.append(A).append(B);
        System.out.println(answer);
    }
}