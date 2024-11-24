import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        double A = Double.parseDouble(st.nextToken());
        double B = Double.parseDouble(st.nextToken());
        double C = Double.parseDouble(st.nextToken());

        st = new StringTokenizer(br.readLine());
        double I = Double.parseDouble(st.nextToken());
        double J = Double.parseDouble(st.nextToken());
        double K = Double.parseDouble(st.nextToken());

        double maxCocktails = Math.min(A / I, Math.min(B / J, C / K));

        double remainingA = A - maxCocktails * I;
        double remainingB = B - maxCocktails * J;
        double remainingC = C - maxCocktails * K;

        System.out.printf("%.6f %.6f %.6f%n", remainingA, remainingB, remainingC);
    }
}