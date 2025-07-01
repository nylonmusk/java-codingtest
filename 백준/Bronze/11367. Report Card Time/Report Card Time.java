import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int score = Integer.parseInt(st.nextToken());
            String grade;

            if (score >= 97) grade = "A+";
            else if (score >= 90) grade = "A";
            else if (score >= 87) grade = "B+";
            else if (score >= 80) grade = "B";
            else if (score >= 77) grade = "C+";
            else if (score >= 70) grade = "C";
            else if (score >= 67) grade = "D+";
            else if (score >= 60) grade = "D";
            else grade = "F";

            System.out.println(name + " " + grade);
        }
    }
}