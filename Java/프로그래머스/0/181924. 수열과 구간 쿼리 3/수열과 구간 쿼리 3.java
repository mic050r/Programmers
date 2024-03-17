class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int temp = 0;
        for(int i = 0; i < queries.length; i++){
            int q1 = queries[i][0];
            int q2 = queries[i][1];
            temp = arr[q1];
            arr[q1] = arr[q2];
            arr[q2] = temp;
        }
        return arr;
    }
}
