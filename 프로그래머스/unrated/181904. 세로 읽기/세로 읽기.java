import java.util.*;

class Solution {
    public StringBuilder solution(String my_string, int m, int c) {
        // 나눈 배열을 저장할 arraylist 선언 
        ArrayList<String> list = new ArrayList<>();
        // 최종 결과를 저장할 arraylist 선언
        StringBuilder answer = new StringBuilder();
        
        // m글자씩 나누어서 list에 저장 
        int cnt = 0;
        for(int i = 0; i < my_string.length(); i++){
            if(cnt < my_string.length()) {
                list.add(my_string.substring(cnt, cnt+=m));
            }
        }
        
        // list에 c열에 적힌 글자를 저장     
        for(String str : list){
            if (c <= str.length()) {
                answer.append(str.charAt(c - 1));
            }
        }
        
        return answer;
    }
}