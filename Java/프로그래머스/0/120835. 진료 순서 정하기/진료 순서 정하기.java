class Solution {
    public int[] solution(int[] emergency) {
        int len = emergency.length;
        int[] answer = new int[len];
        for(int i = 0; i < len; i++) {
            answer[i] = 1;
        }
        
        for(int i = 0; i < len; i++) {
            for(int j = 0; j < len; j++) {
                if(emergency[i] < emergency[j]) {
                    answer[i]++;
                }
            }
        }
        
        return answer;
    }
}