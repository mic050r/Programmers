class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int n = x;
        // 1. 자릿수의 합구하기
        while(n != 0) {
            sum += n%10;
            n /= 10;
        }
        
        // 2. 자릿수의 합이 x와 나누어 떨어지는지
        return (x % sum == 0);
    }
}