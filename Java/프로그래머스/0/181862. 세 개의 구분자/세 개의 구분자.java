import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        List<String> result = new ArrayList<>();
        
        // 1. a,b,c를 구분자로 이용하여 나누기
        String parts[] = myStr.split("[abc]");
        
        // 2. 빈 문자열 제외
        for(String part : parts) {
            if(!part.isEmpty()) {
                result.add(part);
            }
        }
        
        // 3. 코너 케이스 처리
        if(result.isEmpty()) {
            result.add("EMPTY");
        }
        
        // 4. List<String> -> String[]으로 변환
        return result.toArray(new String[0]);
    }
}