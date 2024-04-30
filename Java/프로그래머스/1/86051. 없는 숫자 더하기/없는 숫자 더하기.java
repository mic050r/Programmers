class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean list[] = new boolean[10];
        for(int i = 0; i < numbers.length; i++) {
            list[numbers[i]] = true;
        }
        
        for(int i = 0; i < list.length; i++) {
            if(!list[i]) answer += i;
        }
        return answer;
    }
}