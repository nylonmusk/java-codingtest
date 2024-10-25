import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<String> images = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            StringBuilder sb = new StringBuilder();
            for (String s : str.split("")) {
                sb.append(s).append(s);
            }
            images.add(sb.toString());
        }

        boolean isEyfa = true;

        for (int i = 0; i < N; i++) {
            String secondImage = br.readLine();
            if (!images.get(i).equals(secondImage)) {
                isEyfa = false;
                break;
            }
        }

        if (isEyfa) {
            System.out.println("Eyfa");
        } else {
            System.out.println("Not Eyfa");
        }
    }
}