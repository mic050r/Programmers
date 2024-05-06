import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        // 1. 최솟값 구하기
        int min = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < min) min = arr[i];
        }
        
        // 2. 최솟값을 제외한 수를 arraylist에 저장
        ArrayList<Integer> arrs = new ArrayList<>();
        
        for(int i : arr) {
            if(i != min) arrs.add(i);
        }
        if(arrs.size() == 0) arrs.add(-1);
        
        // 3. ArrayList를 int 배열로 변환
        int[] answer = arrs.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}