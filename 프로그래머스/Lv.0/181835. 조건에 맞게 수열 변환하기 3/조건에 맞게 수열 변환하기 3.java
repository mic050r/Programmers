import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        return Arrays.stream(arr).map(operand -> k % 2 == 0 ? operand + k : operand * k).toArray();
    }
}