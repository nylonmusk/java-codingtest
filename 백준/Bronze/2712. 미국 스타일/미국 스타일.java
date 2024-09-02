import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while (T --> 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double num = Double.parseDouble(st.nextToken());
            String s = st.nextToken();

            if (s.equals("kg")){
                answer.append(String.format("%.4f", num * 2.2046)).append(" lb").append("\n");
            }else if(s.equals("l")){
                answer.append(String.format("%.4f", num * 0.2642)).append(" g").append("\n");
            } else if ((s.equals("lb"))) {
                answer.append(String.format("%.4f", num * 0.4536)).append(" kg").append("\n");
            } else if (s.equals("g")) {
                answer.append(String.format("%.4f", num * 3.7854)).append(" l").append("\n");
            }
        }
        System.out.println(answer);
    }
}