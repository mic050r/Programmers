class Solution {
    public String solution(String s) {
        String answer = "";
        int cnt = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != ' '){ // s값중에 공백이 없을경우
                if(cnt%2==1){ // cnt가 홀수일 경우
                    answer += Character.toLowerCase(s.charAt(i));
                }else{
                    answer += Character.toUpperCase(s.charAt(i));
                }
                cnt++;
            }else{ // s값중에 공백이 있을경우
                answer += " ";
                cnt = 0;
            }
        }
        return answer;
    }
}