import java.util.*;
class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int sum = n*m;
        int tmp;
        // m에 큰값 배치
        // if(n > m){
        //     tmp = m;
        //     n = m;
        //     m = n;
        // }
        // 최대공약수 구하기
        while(n!=0){
            int r = m%n;
            m = n;
            n = r;
        }
        answer[0] = m;
        
        // 최소공배수 구하기
        answer[1] = (sum)/answer[0];
        
        return answer;
    }
}