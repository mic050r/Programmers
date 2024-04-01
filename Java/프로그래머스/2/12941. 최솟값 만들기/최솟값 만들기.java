import java.util.*;

class Solution {
    // 누적된 값이 최소가 되도록
    public int solution(int[] A, int[] B) {
        int answer = 0;
        
        // A 배열은 오름차순으로, B 배열은 내림차순으로 정렬
        Arrays.sort(A);
        Arrays.sort(B);
        
        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[B.length - i - 1];
        }
        
        return answer;
    }
}
