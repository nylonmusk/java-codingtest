import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int T;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] scores = new int[5];
        for (int i = 0; i < T; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
        }

        int buildingNumber = calculateBuildingNumber(scores);

        System.out.println(buildingNumber);
    }

    private static int calculateBuildingNumber(int[] scores) {
        int buildingNumber = 0;

        if (scores[0] > scores[2]) {
            buildingNumber = (scores[0] - scores[2]) * 508;
        } else {
            buildingNumber = (scores[2] - scores[0]) * 108;
        }

        if (scores[1] > scores[3]) {
            buildingNumber += (scores[1] - scores[3]) * 212;
        } else {
            buildingNumber += (scores[3] - scores[1]) * 305;
        }

        buildingNumber += scores[4] * 707;

        return buildingNumber * 4763;
    }
}
