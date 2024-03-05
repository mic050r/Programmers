class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        // 원래 숫자에서 얼마가 빠졌는지 그 값을 구하기 
        
        for(int i = 1 ; i < numLog.length; i++) {
            int num = numLog[i] - numLog[i-1];
            switch(num) {
                case 1 : answer += "w"; break;
                case -1 : answer += "s"; break;
                case 10 : answer += "d"; break;
                case -10 : answer += "a"; break;
            }
        }
        return answer;
    }
}