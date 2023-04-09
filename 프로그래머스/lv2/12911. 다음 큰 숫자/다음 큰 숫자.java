class Solution {
    public int solution(int n) {
        int answer = 0;
        int cntN = 0;
        
        String strN = Integer.toBinaryString(n);
        for(int i = 0; i < strN.length(); i++){
            if(strN.charAt(i)=='1'){
                cntN++;
            }
        }
        for(int i = n+1; i < 1000000; i++){
            String strI = Integer.toBinaryString(i);
            int cntI = 0;
            for(int j = 0; j < strI.length(); j++){
                if(strI.charAt(j)=='1'){
                    cntI++;
                }
            }
            if(cntN == cntI){
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}