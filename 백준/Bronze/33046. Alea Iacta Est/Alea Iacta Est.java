import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int sum1 = A + B;

        st = new StringTokenizer(br.readLine());
        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        int sum2 = C + D;
        
        int gadong = (1 + (sum1 - 1)) % 4;
        if (gadong == 0) gadong = 4;

        int jindong = (gadong + (sum2 - 1)) % 4;
        if (jindong == 0) jindong = 4;

        System.out.println(jindong);
    }
}