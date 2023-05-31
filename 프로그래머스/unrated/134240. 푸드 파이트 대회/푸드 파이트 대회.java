class Solution {
    public String solution(int[] food) {
        String answer = "";
        for(int i = 1; i < food.length; i++){
            if(food[i] >= 2 ) {
                for(int k = 0; k < food[i]/2; k++) answer += i;
            }
        }
        answer += 0;
        for(int i = food.length -1; i > 0; i--){
            if(food[i] >= 2 ){
                for(int k = 0; k < food[i]/2; k++) answer += i;
            }
        }
        return answer;
    }
}