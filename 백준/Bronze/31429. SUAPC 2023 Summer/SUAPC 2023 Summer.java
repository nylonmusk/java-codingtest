import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] results = {
                {12, 1600},
                {11, 894},
                {11, 1327},
                {10, 1311},
                {9, 1004},
                {9, 1178},
                {9, 1357},
                {8, 837},
                {7, 1055},
                {6, 556},
                {6, 773}
        };

        System.out.println(results[N - 1][0] + " " + results[N - 1][1]);
    }
}