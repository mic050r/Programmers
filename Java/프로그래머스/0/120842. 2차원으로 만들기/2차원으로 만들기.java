class Solution {
    public int[][] solution(int[] num_list, int n) {
        int len = num_list.length / n;
        int[][] result = new int[len][n];
        
        int index = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = num_list[index++];
            }
        }
        
        return result;
    }
}
