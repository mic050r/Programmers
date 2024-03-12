class Solution {
    public int[] solution(int[] nums, String direction) {
        int len = nums.length;
        int answer[] = new int[len];
        
        if(direction.equals("right")) {
            int last = nums[len-1];
            for(int i = 0; i < len-1; i++) {
                answer[i+1] = nums[i];
             }
            answer[0] = last;
        } else if(direction.equals("left")) {
            int fir = nums[0];
            for(int i = 0; i < len-1; i++){
                answer[i] = nums[i+1];
            }
            answer[len-1] = fir;
        }
        return answer;
    }
}