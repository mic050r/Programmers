class Solution {
    public String solution(String s, int n) {
        int num = 0; char ch; String str = "";
        for(int i = 0; i < s.length(); i++){
            ch = s.charAt(i);
            if(ch != ' '){
                if(ch >= 'a' && ch <= 'z') { // 소문자일 때
				    if(ch + n > 'z') str += (char)(ch-26+n);
				    else str += (char)(ch+n);
			    }else if(ch >= 'A' && ch <= 'Z') { // 대문자일 때
				    if(ch+n > 'Z') str += (char)(ch-26+n);
				    else str += (char)(ch+n);
			    }
            }else str+= " ";
        }
        return str;
    }
}