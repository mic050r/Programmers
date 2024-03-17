import java.util.*;
class Solution {
    public ArrayList<Integer> solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 0; i < flag.length; i++) {
            int num = arr[i];
            if(flag[i]) {
                for(int j = 0; j < num*2; j++){
                    answer.add(num);
                }
            } else if(!flag[i]) {
                 for(int k = 0; k < num; k++){
                    answer.remove(answer.size()-1);
                }
            }
        }
        return answer;
    }
}