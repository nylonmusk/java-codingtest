import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] answer = new int[2];
        int value = Integer.MIN_VALUE;
        for (int i = 1; i <= 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= 9; j++) {
                int num = Integer.parseInt(st.nextToken());
                if (value < num) {
                    value = num;
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }
        System.out.println(value + "\n" + answer[0] + " " + answer[1]);
    }
}