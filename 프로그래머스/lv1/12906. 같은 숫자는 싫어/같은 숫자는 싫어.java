import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> arraylist = new ArrayList();
		int value=-1;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]!=value) {
				arraylist.add(arr[i]);
				value=arr[i];
			}
		}
        int[] answer=new int[arraylist.size()];
        for(int i = 0; i < arraylist.size(); i++){
            answer[i] = arraylist.get(i);
        }
        return answer;
    }
}