import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class Column implements Comparable<Column> {
    int L;
    int H;

    Column(int L, int H) {
        this.L = L;
        this.H = H;
    }

    @Override
    public int compareTo(Column c) {
        return this.L - c.L;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        int answer = 0;
        List<Column> columns = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(st.nextToken());
            int H = Integer.parseInt(st.nextToken());

            columns.add(new Column(L, H));
        }

        Collections.sort(columns);

        Column prevColumn = columns.get(0);
        for (int i = 1; i < columns.size(); i++) {
            Column nextColumn = columns.get(i);

            if (prevColumn.H <= nextColumn.H) {
                answer += (nextColumn.L - prevColumn.L) * prevColumn.H;
                prevColumn = nextColumn;
            }
        }

        prevColumn = columns.get(columns.size() - 1);
        for (int i = columns.size() - 2; i >= 0; i--) {
            Column nextColumn = columns.get(i);

            if (prevColumn.H < nextColumn.H) {
                answer += (prevColumn.L - nextColumn.L) * prevColumn.H;
                prevColumn = nextColumn;
            }
        }

        answer += prevColumn.H;

        System.out.println(answer);
    }
}
