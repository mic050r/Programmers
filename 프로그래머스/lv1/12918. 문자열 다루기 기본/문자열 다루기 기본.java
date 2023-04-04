class Solution {
    public boolean solution(String s) {
        // 숫자 0의 아스코드 값:  49 , 9의 아스코드 값 : 57
        boolean answer = true;
        int len = s.length(); // s의 길이
        if(len == 4 || len == 6) { 
            for(int i = 0; i < len; i++){
                int n = (int)s.charAt(i);
                if(n < 48 || n > 57) answer = false;
            }
        }else answer = false;
        return answer;
    }
}