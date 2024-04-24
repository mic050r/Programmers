class Solution {
    public int[] solution(long n) {
        // 주어진 자연수를 뒤집어서 저장할 StringBuilder 생성
        StringBuilder reversed = new StringBuilder(String.valueOf(n)).reverse();

        // StringBuilder에 저장된 문자열을 문자 단위로 배열에 저장
        int[] answer = new int[reversed.length()];
        for (int i = 0; i < reversed.length(); i++) {
            answer[i] = Character.getNumericValue(reversed.charAt(i));
        }
        
        return answer;
    }
}
