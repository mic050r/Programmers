class Solution {
    public int solution(int n, int m, int[] section) {
        int secList[] = new int[n+1];
        int cnt = 0;
        // 1. 다시 칠해야하는 곳 곳 = 1, 칠한 곳 = 0
        for(int sec : section){
            secList[sec]++;
        }
        // 2. 
        for(int i = 1; i <= n; i++){
            if(secList[i] == 1){
                cnt++;
                i += m-1;
            }
        }
        return cnt;
    }
}