import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        // 실패한 플레이어 수 (인덱스: 스테이지 번호)
        int[] failCount = new int[N + 2]; 
        // 스테이지에 도전한 총 플레이어 수 (인덱스: 스테이지 번호)
        int[] totalPlayers = new int[N + 2]; 

        // 각 스테이지의 도전자 수와 실패자 수 계산
        for (int stage : stages) {
            failCount[stage]++;
            for (int i = 1; i <= stage; i++) {
                totalPlayers[i]++;
            }
        }

        Map<Integer, Double> failureRateMap = new HashMap<>();

        // 실패율을 계산하여 맵에 저장
        for (int i = 1; i <= N; i++) {
            double failureRate = totalPlayers[i] == 0 ? 0 : (double) failCount[i] / totalPlayers[i];
            failureRateMap.put(i, failureRate);
        }

        // 실패율이 높은 순서대로 스테이지 번호를 정렬하여 결과 배열에 저장
        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            int maxStage = 0;
            double maxFailureRate = -1;
            for (int stage : failureRateMap.keySet()) {
                double failureRate = failureRateMap.get(stage);
                if (failureRate > maxFailureRate) {
                    maxFailureRate = failureRate;
                    maxStage = stage;
                }
            }
            answer[i] = maxStage;
            failureRateMap.remove(maxStage);
        }

        return answer;
    }
}
