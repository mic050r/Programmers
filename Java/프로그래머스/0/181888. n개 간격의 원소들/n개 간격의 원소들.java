import java.util.ArrayList;
import java.util.List;

class Solution {
    public ArrayList<Integer> solution(int[] num_list, int n) {
        List<Integer> answer = new ArrayList<>();
        
        for (int i = 0; i < num_list.length; i += n) {
            if (i < num_list.length) {
                answer.add(num_list[i]);
            }
        }
        
        return new ArrayList<>(answer);
    }
}
