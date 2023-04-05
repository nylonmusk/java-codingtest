class Solution {
    public int solution(int num, int k) {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toString(num));
        String kStr = Integer.toString(k);
        if (sb.indexOf(kStr) == -1) {
            return -1;
        }
        return sb.indexOf(kStr) + 1;
    }
}