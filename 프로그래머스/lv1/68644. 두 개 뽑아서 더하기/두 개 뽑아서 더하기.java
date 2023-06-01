import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length*numbers.length-numbers.length];
        int index = 0;
        // 두 개의 수를 뽑아 더하기
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers.length; j++){
                if(i!= j)
                    answer[index++] = numbers[i] + numbers[j];
            }
        }
        // 정렬
        Arrays.sort(answer);
       
        // 중복되는 수 구하기
        int cnt = 0;
        for(int i = 1; i < answer.length; i++){
            if(answer[i-1] == answer[i])
                cnt++;
        }
        
        // 중복 제거
        int result[] = new int[answer.length-cnt];
        int rIndex = 0;
        result[0] = answer[0];
        for(int i = 0; i< answer.length; i++){
            if(result[rIndex] == answer[i])
                continue;
            result[++rIndex] = answer[i];
        }
        return result;
    }
}