class Solution {
    public int solution(int n) {
        int answerCount = 0;
        for (int i = 4; i <= n; i++) {
            if (isValue(i)) answerCount++;
        }
        return answerCount;
    }

    public boolean isValue(int number) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) count++;
        }
        return count >= 2;
    }
}