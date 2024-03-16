class Solution {
    public StringBuilder solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < my_string.length(); i++) {
            char str = my_string.charAt(i);
            if(i == my_string.indexOf(str)) 
                answer.append(str);
        }
        return answer;
    }
}