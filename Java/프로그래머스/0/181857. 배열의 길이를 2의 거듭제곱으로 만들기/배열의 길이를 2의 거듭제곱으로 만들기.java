import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        while((len & (len-1)) != 0) len++;
        
        int answer[] = Arrays.copyOf(arr, len);
        return answer;
    }
}