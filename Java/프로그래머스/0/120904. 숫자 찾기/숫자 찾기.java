import java.util.*;

class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String str = Integer.toString(num);
        String idx = Integer.toString(k);
        for(int i = 0; i < str.length(); i++){
            if (String.valueOf(str.charAt(i)).equals(idx)) {
                answer = i+1;
                break;
            }
        }
        return answer;
    }
}