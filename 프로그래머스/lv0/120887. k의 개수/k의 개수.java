class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String kStr = Integer.toString(k);
        
        for (int num = i; num <= j; num++) {
            String[] str = Integer.toString(num).split("");
            for (int s = 0; s < str.length; s++) {
                if(kStr.equals(str[s])) answer++;
            }
        }
        return answer;
    }
}