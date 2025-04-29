import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int envelopeWeight = Integer.parseInt(st.nextToken());
        int posterWeight = Integer.parseInt(st.nextToken());
        int infoWeight = Integer.parseInt(st.nextToken());

        double envelopeWidth = 229;
        double envelopeHeight = 324;
        double posterWidth = 297;
        double posterHeight = 420;
        double infoWidth = 210;
        double infoHeight = 297;
        
        double envelopeArea = 2 * (envelopeWidth * envelopeHeight) / 1_000_000.0;
        double posterArea = 2 * (posterWidth * posterHeight) / 1_000_000.0;
        double infoArea = (infoWidth * infoHeight) / 1_000_000.0;  
        
        double totalWeight = envelopeArea * envelopeWeight
                + posterArea * posterWeight
                + infoArea * infoWeight;

        System.out.printf("%.6f\n", totalWeight);
    }
}