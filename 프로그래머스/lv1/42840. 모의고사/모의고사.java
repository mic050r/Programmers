import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int score[] = new int[3];
        int per1[] = {1, 2, 3, 4, 5};
        int per2[] = {2, 1, 2, 3, 2, 4, 2, 5};
        int per3[] = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        
        for(int i = 0; i < answers.length; i++){
            if(per1[i%per1.length] == answers[i]) score[0]++;
            if(per2[i%per2.length] == answers[i]) score[1]++;
            if(per3[i%per3.length] == answers[i]) score[2]++;
        }
        int max = Math.max(score[0], Math.max(score[1], score[2]));
        
        int cnt = 0;
        for ( int i = 0; i < score.length; i++) {
            if ( score[i] == max)
                cnt++;
        }
        
        int[] answer = new int[cnt];
        for ( int i = 0, j = 0; i < score.length; i++) {
            if ( score[i] == max ) {
                answer[j++] = i+1;
            }
        }
        return answer;
    }
}