public class Solution {
    public int solution(long n) {
        int ans = 0;
        while(n!=0){
            if(n%2==0) n/=2;
            if(n%2!=0) {
                n-=1;
                ans++;
            }
        }
        return ans;
    }
}