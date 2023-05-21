class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i=0; i<n; i++){
            String code1 = Integer.toBinaryString(arr1[i]);
            String code2 = Integer.toBinaryString(arr2[i]);
            String ans = "";
            while(code1.length() < n){
                code1 = "0" + code1;
            }
            while(code2.length() < n){
                code2 = "0" + code2;
            }
            for(int j=0; j<n; j++){
                if(code1.charAt(j)=='1' || code2.charAt(j) == '1'){
                    ans += '#';
                }else{
                    ans += " ";
                }
            }
            answer[i] = ans;
        }
        return answer;
    }
}
