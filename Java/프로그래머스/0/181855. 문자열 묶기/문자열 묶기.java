import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        // 문자열 길이가 최대 30이므로 크기가 31인 배열 생성
        int[] lengthCount = new int[31];
        
        // 1. 각 문자열의 길이에 맞는 인덱스에 +1씩 더해주기
        for(String str : strArr) {
            int len = str.length();
            lengthCount[len]++;
        }
        
        // 2. 가장 큰 값 찾기
        int maxCount = 0;
        for(int count : lengthCount) {
            if(count > maxCount) {
                maxCount = count;
            }
        }
        
        return maxCount;
    }
}
