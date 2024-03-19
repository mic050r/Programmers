import java.util.*;

class Solution {
    public String solution(String letter) {
        StringBuilder answer = new StringBuilder();
        String mos[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        // 모스 부호와 영어 소문자 매핑
        Map<String, Character> morse = new HashMap<>();
        char letterChar = 'a';
        for (String code : mos) {
            morse.put(code, letterChar);
            letterChar++;
        }
        
        // 편지 공백으로 나눠서 배열에 저장
        String let[] = letter.split(" ");
        
        // 모스 부호를 영어 소문자로 변환하여 answer에 추가
        for (String code : let) {
            answer.append(morse.get(code));
        }
        
        return answer.toString();
    }
    
}
