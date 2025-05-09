import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();

        while (T-- > 0) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            int columnCount = Integer.parseInt(tokenizer.nextToken());
            int rowCount = Integer.parseInt(tokenizer.nextToken());

            BigInteger[] columnProducts = new BigInteger[columnCount];
            Arrays.fill(columnProducts, BigInteger.ONE);

            for (int row = 0; row < rowCount; row++) {
                tokenizer = new StringTokenizer(br.readLine());
                for (int col = 0; col < columnCount; col++) {
                    BigInteger value = new BigInteger(tokenizer.nextToken());
                    columnProducts[col] = columnProducts[col].multiply(value);
                }
            }

            int maxColumnIndex = 0;
            BigInteger maxProduct = columnProducts[0];

            for (int i = 1; i < columnCount; i++) {
                if (maxProduct.compareTo(columnProducts[i]) <= 0) {
                    maxProduct = columnProducts[i];
                    maxColumnIndex = i;
                }
            }

            answer.append(maxColumnIndex + 1).append('\n');
        }

        System.out.print(answer);
    }
}