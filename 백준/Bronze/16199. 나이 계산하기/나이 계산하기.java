import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int birthYear = Integer.parseInt(st.nextToken());
        int birthMonth = Integer.parseInt(st.nextToken());
        int birthDay = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int standardYear = Integer.parseInt(st.nextToken());
        int standardMonth = Integer.parseInt(st.nextToken());
        int standardDay = Integer.parseInt(st.nextToken());

        int ageYear = standardYear - birthYear;
        if (standardMonth < birthMonth || (standardMonth == birthMonth && standardDay < birthDay)) {
            ageYear--;
        }
        System.out.println(ageYear);

        int koreanAge = standardYear - birthYear + 1;
        System.out.println(koreanAge);

        int yearsAge = standardYear - birthYear;
        System.out.println(yearsAge);
    }
}
