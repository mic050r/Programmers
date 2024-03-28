class Solution {
    public String solution(String phone_number) {
        StringBuilder answer = new StringBuilder();
        int len = phone_number.length();
        // 1. 폰번호 길이 - 4 만큼 * 넣은 후
        for(int i = 0; i < len - 4; i++) {
            answer.append("*");
        }
        // 2. 폰 번호 뒤에 있는 4자리 수를 넣기
        answer.append(phone_number.substring(len - 4, len));
        
        return answer.toString();
    }
}