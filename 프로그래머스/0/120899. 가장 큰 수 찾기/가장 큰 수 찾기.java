import java.util.*;
class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = Arrays.stream(array).max().getAsInt();
        int idx = Arrays.binarySearch(array, max);
        answer[0] = max;
        answer[1] = idx;
        return answer;
    }
}