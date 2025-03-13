import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        int minTasks = (n + 1) * 2;
        int maxTasks = (n + 1) * 3;

        System.out.println(minTasks + " " + maxTasks);
    }
}