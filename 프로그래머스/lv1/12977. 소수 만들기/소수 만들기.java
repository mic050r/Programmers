class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int cnt = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                for(int k = j+1; k < nums.length; k++){
                    answer = nums[i] + nums[j] + nums[k];
                    if(setPrime(answer)) cnt++;
                }
            }
        }
        return cnt;
    }
    // 소수 구하는 함수
    public boolean setPrime(int num) {
        boolean setPrime = true;
        for ( int i = 2; i <= num/2; i++) {
            if ( num % i == 0) {
                setPrime = false;
                break;
            }
        }
        return setPrime;
    }
}
  