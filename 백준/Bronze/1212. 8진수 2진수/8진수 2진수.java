import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        StringBuilder sb = new StringBuilder();

        int first = s.charAt(0) - '0';
        sb.append(Integer.toBinaryString(first));

        for (int i = 1; i < s.length(); i++) {
            int n = s.charAt(i) - '0';
            String bin = Integer.toBinaryString(n);
            if (bin.length() == 1) sb.append("00").append(bin);
            else if (bin.length() == 2) sb.append("0").append(bin);
            else sb.append(bin);
        }

        System.out.println(sb);
    }
}