class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[start-end+1];
        int i = 0, cnt = start;
        for(i = 0; i <= cnt; i++){
            answer[i] = start;
            start--;
            if(start < end) break;
        }
        return answer;
    }
}