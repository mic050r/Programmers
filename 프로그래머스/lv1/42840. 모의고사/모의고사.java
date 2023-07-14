import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        // 3명의 사람들의 점수를 저장할 배열
        int score[] = new int[3];
        
        // 각 사람들의 찍기 패턴
        int per1[] = {1, 2, 3, 4, 5};
        int per2[] = {2, 1, 2, 3, 2, 4, 2, 5};
        int per3[] = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        // 주어진 답안 배열을 순회하면서 점수 계산
        for (int i = 0; i < answers.length; i++) {
            // 각 사람들의 패턴 배열을 이용하여 정답과 비교하여 점수 증가
            if (per1[i % per1.length] == answers[i]) 
                score[0]++;
            if (per2[i % per2.length] == answers[i]) 
                score[1]++;
            if (per3[i % per3.length] == answers[i]) 
                score[2]++;
        }

        // 가장 높은 점수 계산
        int max = Math.max(score[0], Math.max(score[1], score[2]));

        // 가장 높은 점수를 받은 개인들의 수 계산
        int cnt = 0;
        for (int i = 0; i < score.length; i++) {
            if (score[i] == max) {
                cnt++;
            }
        }

        // 가장 높은 점수를 받은 개인들의 배열 생성
        int[] answer = new int[cnt];
        int j = 0;
        for (int i = 0; i < score.length; i++) {
            if (score[i] == max) {
                answer[j] = i + 1;
                j++;
            }
        }

        // 결과 배열 반환
        return answer;
    }
}
