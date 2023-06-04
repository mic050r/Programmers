class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(true){
            int remain = n%a;
            n = n/a * b;
            if(remain==0){
                answer += n;
            }else{
                answer += n;
                n += remain;
            }
            if(n<a) break;
        }
        return answer;
    }
}