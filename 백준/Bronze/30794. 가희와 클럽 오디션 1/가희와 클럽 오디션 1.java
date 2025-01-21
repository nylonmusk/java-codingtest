import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int lv = Integer.parseInt(input[0]);
        String judgment = input[1];

        int answer = 0;
        switch (judgment) {
            case "miss":
                answer = 0;
                break;
            case "bad":
                answer = 200 * lv;
                break;
            case "cool":
                answer = 400 * lv;
                break;
            case "great":
                answer = 600 * lv;
                break;
            case "perfect":
                answer = 1000 * lv;
                break;
        }

        System.out.println(answer);
    }
}