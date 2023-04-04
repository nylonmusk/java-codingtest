class Solution {
    public int solution(int price) {
        double salePercent = 1;
        if(price >= 100000) salePercent = 0.95;
        if(price >= 300000) salePercent = 0.9;
        if(price >= 500000) salePercent = 0.8;
        
        return (int)(price * salePercent);
    }
}