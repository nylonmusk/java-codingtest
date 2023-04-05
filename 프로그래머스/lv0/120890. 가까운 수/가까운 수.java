import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        // int leftValue = 0;
        // int rightValue = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > n) {
                // leftValue = n - array[(i - 1)];
                // rightValue = array[i] - n;
                // return leftValue <= rightValue ? array[(i - 1)] : array[i];
                if(i != 0){
                if (n - array[(i - 1)] <= array[i] - n) {
                    return array[(i - 1)];
                }else {
                    return array[i];
                }
                // return n - array[(i - 1)] <= array[i] - n ? array[(i - 1)] : array[i];
            }
                }
        }
        return array[array.length - 1];
    }
}