import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int flour = Integer.parseInt(st.nextToken());
        int choco = Integer.parseInt(st.nextToken());
        int egg   = Integer.parseInt(st.nextToken());
        int butter= Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int fNeed = Integer.parseInt(st.nextToken());
        int cNeed = Integer.parseInt(st.nextToken());
        int eNeed = Integer.parseInt(st.nextToken());
        int bNeed = Integer.parseInt(st.nextToken());

        int made = 0;

        int q = Integer.parseInt(br.readLine());
        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());
            int type = Integer.parseInt(st.nextToken());
            int val = Integer.parseInt(st.nextToken());

            switch (type) {
                case 1:
                    if (flour >= fNeed * val && choco >= cNeed * val && egg >= eNeed * val && butter >= bNeed * val) {
                        flour -= fNeed * val;
                        choco -= cNeed * val;
                        egg   -= eNeed * val;
                        butter-= bNeed * val;
                        made += val;
                        System.out.println(made);
                    } else {
                        System.out.println("Hello, siumii");
                    }
                    break;
                case 2:
                    flour += val;
                    System.out.println(flour);
                    break;
                case 3:
                    choco += val;
                    System.out.println(choco);
                    break;
                case 4:
                    egg += val;
                    System.out.println(egg);
                    break;
                case 5:
                    butter += val;
                    System.out.println(butter);
                    break;
            }
        }
    }
}
