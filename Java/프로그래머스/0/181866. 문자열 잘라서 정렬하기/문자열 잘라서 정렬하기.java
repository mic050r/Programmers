import java.util.*;

class Solution {
    public List<String> solution(String str) {
        List<String> answer = new ArrayList<>();
        StringBuilder words = new StringBuilder();
        // 1. x를 기준으로 문자열 잘라내기
        for(int i = 0; i < str.length(); i++){
            char currentChar = str.charAt(i);
            if(currentChar == 'x') {
                if(words.length() > 0) {
                    answer.add(words.toString());
                    words.setLength(0); // stringbuilder 값 초기화
                }
            } else {
                words.append(currentChar);
            }
        }
        
        if (words.length() > 0) {
            answer.add(words.toString());
        }
        
        // 2. 사전순으로 정렬한 배열
        Collections.sort(answer);
        
        return answer;
    }
}
