import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int stageCnt = 0;
        List<double[]> fail_rate = new ArrayList<>();
        double people = stages.length;
        for(int i=1; i<=N; i++){
            for(int j=0; j<stages.length; j++){
                if(i==stages[j]){
                    stageCnt++;
                }
            }
                if(stageCnt==0){
                    fail_rate.add(new double[]{i,0});
                    continue;
                }
                fail_rate.add(new double[]{i,stageCnt/people});
                people -= stageCnt;
                stageCnt=0;
        }
        fail_rate.sort((a,b)->Double.compare(b[1],a[1]));
        for(int i=0; i<fail_rate.size(); i++){
            answer[i] = (int)fail_rate.get(i)[0];    
        }
    
        return answer;
    }
}