import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        String m = st.nextToken();

        int requirePeople = 0;
        if (m.equals("Y")) {
            requirePeople = 1;
        } else if(m.equals("F")) {
            requirePeople = 2;
        } else {
            requirePeople = 3;
        }

        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        System.out.println(set.size() / requirePeople);
    }
}