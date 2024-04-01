class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min = 101; // 최대값으로 초기화
        
        for(int i = 0; i < array.length; i++){
            int cha = Math.abs(n - array[i]); // 현재 값과 n의 차이의 절대값 계산
            if(cha < min) {
                min = cha; // 최솟값 업데이트
                answer = array[i]; // 가장 가까운 수 업데이트
            } else if (cha == min) {
                answer = Math.min(answer, array[i]); // 최솟값이 같은 경우 더 작은 수로 업데이트
            }
        }
        
        return answer;
    }
}
