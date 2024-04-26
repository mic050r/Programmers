class Solution {
    public int solution(int n) {
        int i = 0;
        while(true) {
            i = i+1;
            if(n%i == 1) break;
        }
        
        return i;
    }
}