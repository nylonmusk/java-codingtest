class Solution {
    public long solution(int price, long money, int count) {
        for(int i=1; i<=count; i++){
            money -= price*i;    
        }
        if(money<0) return -money;
        else        return 0;
    }
}