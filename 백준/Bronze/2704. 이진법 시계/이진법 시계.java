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
            StringTokenizer st = new StringTokenizer(br.readLine(), ":");
            int hour = Integer.parseInt(st.nextToken());
            int minute = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());

            String hourBinary = String.format("%6s", Integer.toBinaryString(hour)).replace(' ', '0');
            String minuteBinary = String.format("%6s", Integer.toBinaryString(minute)).replace(' ', '0');
            String secondBinary = String.format("%6s", Integer.toBinaryString(second)).replace(' ', '0');

            StringBuilder threeColumn = new StringBuilder();
            for (int j = 0; j < 6; j++) {
                threeColumn.append(hourBinary.charAt(j))
                        .append(minuteBinary.charAt(j))
                        .append(secondBinary.charAt(j));
            }

            String threeRow = hourBinary + minuteBinary + secondBinary;

            answer.append(threeColumn).append(" ").append(threeRow).append("\n");
        }

        System.out.print(answer);
    }
}