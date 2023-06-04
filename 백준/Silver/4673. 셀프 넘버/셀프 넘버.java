public class Main {
    public static void main(String[] args) {
        boolean[] number = new boolean[10001];

        for (int i = 1; i <= 10000; i++) {
            int selfNumber = getSelfNumber(i);
            if (selfNumber <= 10000) {
                number[selfNumber] = true;
            }
        }
        for (int i = 1; i <= 10000; i++) {
            if (!number[i]) {
                System.out.println(i);
            }
        }
    }

    private static int getSelfNumber(int i) {
        int sum = i;
        while (i != 0) {
            sum += i % 10;
            i /= 10;
        }
        return sum;
    }
}
