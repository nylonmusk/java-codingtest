import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double A1 = Double.parseDouble(st.nextToken());
            double P1 = Double.parseDouble(st.nextToken());

            st = new StringTokenizer(br.readLine());
            double R1 = Double.parseDouble(st.nextToken());
            double P2 = Double.parseDouble(st.nextToken());

            double sliceValue = A1 / P1;
            double wholeValue = (Math.PI * R1 * R1) / P2;

            if (wholeValue > sliceValue) {
                answer.append("Whole pizza\n");
            } else {
                answer.append("Slice of pizza\n");
            }
        }

        System.out.print(answer);
    }
}