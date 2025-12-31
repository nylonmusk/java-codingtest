import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine().trim());

        String base = "AKARAKA";
        String add = base.substring(3);

        StringBuilder answer = new StringBuilder();
        answer.append(base);

        for (int i = 1; i < K; i++) {
            answer.append(add);
        }

        System.out.print(answer);
    }
}