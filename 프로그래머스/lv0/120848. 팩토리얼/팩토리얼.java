class Solution {
    public int solution(int n) {
        int answer = 1;
        int i = 1;
        while (n >= answer) {
            answer *= i;
            i++;
        }
        return i - 2;
    }
}