import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int answer = 0;
        String mbti = br.readLine();
        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            if (mbti.equals(br.readLine())) answer++;
        }
        System.out.println(answer);
    }
}