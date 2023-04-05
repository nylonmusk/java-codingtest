class Solution {
    public int[] solution(int[] arr) {        
        if (arr.length == 1) return new int[] {-1};

        int min = Integer.MAX_VALUE;
        
        for (int a : arr) {
            if (min > a) min = a;
        }

        int[] newArr = new int[arr.length - 1];
        int index = 0;
        
        for (int a : arr) {
            if (min != a) newArr[index++] = a;
        }
        
        return newArr;
    }
}