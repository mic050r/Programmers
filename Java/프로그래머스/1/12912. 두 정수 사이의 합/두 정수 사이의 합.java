class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int Num1 = a;
        int Num2 = b;
        
        if(a > b) {
            Num1 = b; 
            Num2 = a;
        }
        
        for(int i = Num1; i <=Num2; i++) answer += i;
        return answer;
    }
}