class Solution {
    public int solution(int num1, int num2, int k) {
        int answer = 0;
        
        char targetChar = (k + "").charAt(0);
        
        for(int i = num1; i <= num2; i++){
            String str = i+"";
            for(int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == targetChar) answer++; 
            }
        }
        return answer;
    }
}
