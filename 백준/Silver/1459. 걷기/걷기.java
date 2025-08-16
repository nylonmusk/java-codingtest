import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long X = Long.parseLong(st.nextToken());
        long Y = Long.parseLong(st.nextToken());
        long W = Long.parseLong(st.nextToken());
        long S = Long.parseLong(st.nextToken());

        long option1 = (X + Y) * W;
        long option2 = Math.min(X, Y) * S + (Math.abs(X - Y)) * W;
        long option3;
        if ((X + Y) % 2 == 0) {
            option3 = Math.max(X, Y) * S;
        } else {
            option3 = (Math.max(X, Y) - 1) * S + W;
        }

        long answer = Math.min(option1, Math.min(option2, option3));
        System.out.println(answer);
    }
}