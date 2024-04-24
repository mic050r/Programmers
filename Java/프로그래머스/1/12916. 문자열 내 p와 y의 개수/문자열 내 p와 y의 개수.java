class Solution {
    boolean solution(String s) {
        int cntY = 0;
        int cntP = 0;
        String list = s.toLowerCase();
        
        for(int i = 0; i < list.length(); i++) {
            if(list.charAt(i) == ('p'))  cntP++;
            else if(list.charAt(i) == ('y')) cntY++;
        }
        
        return (cntP == cntY) ? true : false;
    }
}