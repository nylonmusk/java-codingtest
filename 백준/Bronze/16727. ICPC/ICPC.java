import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int p1 = Integer.parseInt(st.nextToken());
        int s1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int s2 = Integer.parseInt(st.nextToken());
        int p2 = Integer.parseInt(st.nextToken());

        int persepolisTotal = p1 + p2;
        int esteghlalTotal = s1 + s2;

        if (persepolisTotal > esteghlalTotal) {
            System.out.println("Persepolis");
        } else if (esteghlalTotal > persepolisTotal) {
            System.out.println("Esteghlal");
        } else {
            if (s1 > p2) {
                System.out.println("Esteghlal");
            } else if (p2 > s1) {
                System.out.println("Persepolis");
            } else {
                System.out.println("Penalty");
            }
        }
    }
}