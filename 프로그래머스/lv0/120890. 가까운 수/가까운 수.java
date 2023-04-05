import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] > n) {
                if(i != 0){
                    if (n - array[(i - 1)] <= array[i] - n) {
                        return array[(i - 1)];
                    }else {
                        return array[i];
                    }
                }
            }
        }
        return array[array.length - 1];
    }
}