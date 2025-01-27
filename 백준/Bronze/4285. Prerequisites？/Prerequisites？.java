import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        String line;

        while (!(line = br.readLine()).equals("0")) {
            StringTokenizer st = new StringTokenizer(line);
            int k = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            Set<Integer> selectedCourses = new HashSet<>();
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < k; i++) {
                selectedCourses.add(Integer.parseInt(st.nextToken()));
            }

            boolean meetsRequirements = true;

            for (int i = 0; i < m; i++) {
                if (!meetsRequirements) {
                    br.readLine();
                    continue;
                }

                st = new StringTokenizer(br.readLine());
                int c = Integer.parseInt(st.nextToken());
                int r = Integer.parseInt(st.nextToken());
                int count = 0;

                for (int j = 0; j < c; j++) {
                    int course = Integer.parseInt(st.nextToken());
                    if (selectedCourses.contains(course)) {
                        count++;
                    }
                }

                if (count < r) {
                    meetsRequirements = false;
                }
            }

            answer.append(meetsRequirements ? "yes\n" : "no\n");
        }

        System.out.print(answer);
    }
}