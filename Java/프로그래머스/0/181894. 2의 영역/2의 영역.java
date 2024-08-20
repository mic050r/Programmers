import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        // 배열에서 2가 처음 나타나는 인덱스 찾기
        int firstIdx = -1;
        int lastIdx = -1;

        // 첫 번째와 마지막 인덱스를 찾기 위한 반복문
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (firstIdx == -1) {
                    firstIdx = i;  // 첫 번째로 발견된 인덱스
                }
                lastIdx = i;  // 마지막으로 발견된 인덱스
            }
        }

        // 만약 2가 배열에 없으면 -1 반환
        if (firstIdx == -1 || lastIdx == -1) {
            return new int[]{-1}; // 2가 없으면 -1을 포함한 배열 반환
        }

        // firstIdx부터 lastIdx까지 부분 배열 추출
        int len = lastIdx - firstIdx + 1;
        int[] answer = new int[len];
        for (int i = 0; i < len; i++) {
            answer[i] = arr[firstIdx + i];
        }

        return answer;
    }
}
