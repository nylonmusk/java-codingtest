import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] parts = br.readLine().split(" ");
        int n = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);
        int k = Integer.parseInt(parts[2]);
        int a = Integer.parseInt(parts[3]);
        int b = Integer.parseInt(parts[4]);
        int c = Integer.parseInt(parts[5]);

        int joffrey = n * a;
        int robb = m * b;
        int stannis = k * c;

        int max = Math.max(joffrey, Math.max(robb, stannis));

        List<String> kings = new ArrayList<>();
        if (joffrey == max) kings.add("Joffrey");
        if (robb == max) kings.add("Robb");
        if (stannis == max) kings.add("Stannis");

        Collections.sort(kings);
        System.out.println(String.join(" ", kings));
    }
}