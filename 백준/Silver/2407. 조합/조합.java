import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        m = Math.min(m, n - m);
        BigInteger res = BigInteger.ONE;
        for (int i = 1; i <= m; i++){
            res = res.multiply(BigInteger.valueOf(n - m + i)).divide(BigInteger.valueOf(i));
        }
        System.out.println(res);
    }
}