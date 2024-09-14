import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine());
            String maxSchool = "";
            int maxConsumption = 0;

            for (int i = 0; i < N; i++) {
                String[] input = br.readLine().split(" ");
                String school = input[0];
                int consumption = Integer.parseInt(input[1]);

                if (consumption > maxConsumption) {
                    maxConsumption = consumption;
                    maxSchool = school;
                }
            }

            System.out.println(maxSchool);
        }
    }
}