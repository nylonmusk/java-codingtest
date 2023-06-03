import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String dataType = getIntegerDataType(N);
        System.out.println(dataType);
    }

    private static String getIntegerDataType(int N) {
        int numLongs = N / 4;
        StringBuilder dataType = new StringBuilder("long");

        for (int i = 0; i < numLongs - 1; i++) {
            dataType.append(" long");
        }

        dataType.append(" int");
        return dataType.toString();
    }
}
