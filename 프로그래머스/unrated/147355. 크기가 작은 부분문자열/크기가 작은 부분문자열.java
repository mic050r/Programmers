class Solution {
    public int solution(String t, String p) {
        int cnt = 0, i = 0;
        int len = p.length();
        for(i = 0; i < t.length()- len + 1; i++){
            String str = t.substring(i, i + len);
            if(Long.parseLong(str) <= Long.parseLong(p)) cnt++;
        }
        return cnt;
    }
}