import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> students = new ArrayList<>();
        for (int i = 0; i < 2 * n; i++) {
            students.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(students);

        int answer = Integer.MAX_VALUE;

        int start = 0;
        int end = 2 * n -1;

        while (start < end) {
            answer = Math.min(answer, students.get(start) + students.get(end));
            start++;
            end--;
        }
        System.out.println(answer);
    }
}