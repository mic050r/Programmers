class Solution {
    public int solution(int[][] sizes) {
        int answer = 0; int temp = 0;
        int maxW = 0;int maxH = 0;
        // 더 큰 값을 가로에 넣기
        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }
        for(int i = 0; i < sizes.length; i++){
            maxW = Math.max(maxW, sizes[i][0]);
            maxH = Math.max(maxH, sizes[i][1]);
        }
        answer = maxW*maxH;
        return answer;
    }
}