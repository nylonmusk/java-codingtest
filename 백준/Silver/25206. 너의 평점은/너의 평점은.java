import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Double> gradeMap = new HashMap<>();
        gradeMap.put("A+", 4.5);
        gradeMap.put("A0", 4.0);
        gradeMap.put("B+", 3.5);
        gradeMap.put("B0", 3.0);
        gradeMap.put("C+", 2.5);
        gradeMap.put("C0", 2.0);
        gradeMap.put("D+", 1.5);
        gradeMap.put("D0", 1.0);
        gradeMap.put("F", 0.0);
        double sum = 0;
        double gradeSum = 0;
        int n = 20;
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            st.nextToken();
            double i = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();
            if (grade.equals("P")) {
                continue;
            } else {
                sum += i;
                gradeSum += i * gradeMap.get(grade);
            }
        }
        System.out.println(gradeSum / sum);
    }
}
