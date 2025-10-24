import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        boolean isImyun = isImyun(N);
        boolean isImhyun = isImhyun(N);

        int result;
        if (isImyun && isImhyun) result = 4;
        else if (isImyun) result = 1;
        else if (isImhyun) result = 2;
        else result = 3;

        System.out.println(result);
    }

    private static boolean isImyun(int n) {
        if (!(n == 4 || n >= 6)) return false;
        int sum = 0;
        int tmp = n;
        while (tmp > 0) {
            sum += tmp % 10;
            tmp /= 10;
        }
        return (sum % 2 == 1);
    }

    private static boolean isImhyun(int n) {
        if (n == 2 || n == 4) return true;
        if (n <= 1) return false;
        if (isPrime(n)) return false;

        int cntDistinct = 0;
        int tmp = n;
        for (int p = 2; p * p <= tmp; p++) {
            if (tmp % p == 0) {
                cntDistinct++;
                while (tmp % p == 0) tmp /= p;
            }
        }
        if (tmp > 1) cntDistinct++;
        return (cntDistinct % 2 == 0);
    }

    private static boolean isPrime(int x) {
        if (x <= 1) return false;
        if (x <= 3) return true;
        if (x % 2 == 0) return false;
        for (int i = 3; i * i <= x; i += 2) {
            if (x % i == 0) return false;
        }
        return true;
    }
}