import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


class Applicant {
    int paperScore;
    int interviewScore;

    public Applicant(int paperScore, int interviewScore) {
        this.paperScore = paperScore;
        this.interviewScore = interviewScore;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;

        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());


            List<Applicant> applicants = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                int paperScore = Integer.parseInt(st.nextToken());
                int interviewScore = Integer.parseInt(st.nextToken());
                applicants.add(new Applicant(paperScore, interviewScore));
            }

            applicants.sort((a1, a2) -> a1.paperScore - a2.paperScore);

            int answer = 0;
            int minInterviewScore = Integer.MAX_VALUE;
            for (Applicant applicant : applicants) {
                if (applicant.interviewScore < minInterviewScore) {
                    minInterviewScore = applicant.interviewScore;
                    answer++;
                }
            }

            System.out.println(answer);
        }
    }
}
