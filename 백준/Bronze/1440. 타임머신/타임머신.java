import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] time = br.readLine().split(":");

        int[] nums = new int[3];
        for (int i = 0; i < 3; i++) {
            nums[i] = Integer.parseInt(time[i]);
        }

        int count = 0;

        if (isValid(nums[0], nums[1], nums[2])) count++;
        if (isValid(nums[0], nums[2], nums[1])) count++;
        if (isValid(nums[1], nums[0], nums[2])) count++;
        if (isValid(nums[1], nums[2], nums[0])) count++;
        if (isValid(nums[2], nums[0], nums[1])) count++;
        if (isValid(nums[2], nums[1], nums[0])) count++;

        System.out.println(count);
    }
    
    private static boolean isValid(int h, int m, int s) {
        return (1 <= h && h <= 12) && (0 <= m && m <= 59) && (0 <= s && s <= 59);
    }
}