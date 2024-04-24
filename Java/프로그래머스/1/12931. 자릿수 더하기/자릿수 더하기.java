import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // arrN : n을 문자열 -> 문자열 배열로
        String[] arrN = (Integer.toString(n)).split("");
        
        // arrN을 돌리면서 arrN값을 int형으로 변환한뒤 answer에 추가
        for(String i : arrN) answer += Integer.parseInt(i);
        return answer;
    }
}