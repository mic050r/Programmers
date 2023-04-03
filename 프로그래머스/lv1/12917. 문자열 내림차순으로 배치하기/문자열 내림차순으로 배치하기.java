import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        // toCharArray() 사용하기
        char str[] = s.toCharArray();
        Arrays.sort(str);
        
        for(int i = str.length - 1; i >= 0; i--){
            answer += str[i];
        }
        return answer;
    }
}