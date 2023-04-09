class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int j = 0;
        while(arr.length!=j){
            j=0;
            answer++;
            for(int i = 0; i < arr.length; i++){
                if(answer%arr[i]==0){
                    j++;
                }
            }
        }
        return answer;
    }
}