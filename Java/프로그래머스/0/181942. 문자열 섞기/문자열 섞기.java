import java.util.*;
class Solution {
    public StringBuilder solution(String str1, String str2) {
        StringBuilder answer = new StringBuilder();
        String len = str1.concat(str2);
        for(int i = 0; i < str1.length(); i++){
            answer.append(str1.charAt(i));
            answer.append(str2.charAt(i));
        }
        return answer;
    }
}