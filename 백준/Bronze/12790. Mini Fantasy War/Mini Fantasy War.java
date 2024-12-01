import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main  {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int baseHP = Integer.parseInt(st.nextToken());
            int baseMP = Integer.parseInt(st.nextToken());
            int baseAtk = Integer.parseInt(st.nextToken());
            int baseDef = Integer.parseInt(st.nextToken());

            int equipHP = Integer.parseInt(st.nextToken());
            int equipMP = Integer.parseInt(st.nextToken());
            int equipAtk = Integer.parseInt(st.nextToken());
            int equipDef = Integer.parseInt(st.nextToken());

            int finalHP = Math.max(1, baseHP + equipHP);
            int finalMP = Math.max(1, baseMP + equipMP);
            int finalAtk = Math.max(0, baseAtk + equipAtk);
            int finalDef = baseDef + equipDef;

            int combatPower = finalHP + 5 * finalMP + 2 * finalAtk + 2 * finalDef;
            answer.append(combatPower).append("\n");
        }

        System.out.print(answer);
    }
}