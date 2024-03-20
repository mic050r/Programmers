class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for(int i = 0; i < num_list.length; i++) {
            int arr = num_list[i];
            while(arr != 1) {
                arr = (arr % 2 == 0) ? arr/2 : (arr-1)/2;
                answer++;
            }
        }
        return answer;
    }
}