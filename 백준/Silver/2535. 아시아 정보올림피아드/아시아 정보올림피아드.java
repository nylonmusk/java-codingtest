import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    private static class Student implements Comparable<Student> {
        int country;
        int number;
        int score;

        Student(int c, int n, int s) {
            country = c;
            number = n;
            score = s;
        }

        public int compareTo(Student o) {
            return o.score - this.score;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        ArrayList<Student> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int c = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            list.add(new Student(c, n, s));
        }

        Collections.sort(list);

        int[] cnt = new int[101];
        int medal = 0;

        for (Student st : list) {
            if (cnt[st.country] >= 2) {
                continue;
            }
            System.out.println(st.country + " " + st.number);
            cnt[st.country]++;
            medal++;
            if (medal == 3) {
                break;
            }
        }
    }
}