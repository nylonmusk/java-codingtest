class Solution {
    public int solution(int a, int b) {
        return Math.max(Integer.parseInt(String.valueOf(a) + b), Integer.parseInt(String.valueOf(b) + a));
    }
}