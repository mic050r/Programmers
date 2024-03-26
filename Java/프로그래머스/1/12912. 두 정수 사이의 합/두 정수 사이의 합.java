class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int num1 = 0; int num2 = 0;
        if(a <= b) {
            num1 = a;
            num2 = b;
        } else {
            num1 = b;
            num2 = a;
        }
        for(int i = num1; i <= num2; i++) answer+=i;
        return answer;
    }
}