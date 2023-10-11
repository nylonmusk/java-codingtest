import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        String answer = "";
        if (A + B == C) answer = A + "+" + B + "=" + C;
        if (A - B == C) answer = A + "-" + B + "=" + C;
        if (A * B == C) answer = A + "*" + B + "=" + C;
        if (A / B == C && A % B == 0) answer = A + "/" + B + "=" + C;
        if (A == B + C) answer = A + "=" + B + "+" + C;
        if (A == B - C) answer = A + "=" + B + "-" + C;
        if (A == B * C) answer = A + "=" + B + "*" + C;
        if (A == B / C && B % C == 0) answer = A + "=" + B + "/" + C;
        System.out.println(answer);
    }
}
