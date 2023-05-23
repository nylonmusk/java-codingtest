import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    static List<String> list;
    static StringBuilder sb;
    static Set<String> passwordSet;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int L = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        list = new ArrayList<>();
        for (int i = 0; i < C; i++) {
            list.add(st.nextToken());
        }

        Collections.sort(list);

        passwordSet = new HashSet<>();
        generatePassword(L, "", 0);
        List<String> l = new ArrayList<>(passwordSet);
        Collections.sort(l);
        for (String password : l) {
            sb.append(password).append("\n");
        }
        System.out.println(sb);
    }

    private static void generatePassword(int L, String password, int i) {
        if (password.length() == L) {
            if (isValid(password)) {
                passwordSet.add(password);
            }
            return;
        }

        if (i >= list.size()) {
            return;
        }

        generatePassword(L, password + list.get(i), i + 1);
        generatePassword(L, password, i + 1);
    }

    private static boolean isValid(String password) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        int vowelCount = 0;
        int consonantCount = 0;

        for (char c : password.toCharArray()) {
            if (vowels.contains(c)) {
                vowelCount++;
            } else {
                consonantCount++;
            }
        }

        return vowelCount >= 1 && consonantCount >= 2;
    }
}